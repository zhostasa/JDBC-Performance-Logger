package ch.sla.jdbcperflogger.console.db;

import java.util.UUID;

import javax.annotation.Nullable;

public interface LogRepositoryRead {

    void getStatements(@Nullable String filter, @Nullable Long minDurationNanos, ResultSetAnalyzer analyzer,
            boolean withFilledSql);

    void getStatementsGroupByRawSQL(@Nullable String filter, @Nullable Long minDurationNanos, ResultSetAnalyzer analyzer);

    void getStatementsGroupByFilledSQL(@Nullable String filter, @Nullable Long minDurationNanos,
            ResultSetAnalyzer analyzer);

    void getBatchStatementExecutions(UUID logId, ResultSetAnalyzer analyzer);

    long getLastModificationTime();

    @Nullable
    DetailedViewStatementLog getStatementLog(long id);

    int countStatements();

    long getTotalExecAndFetchTimeNanos();

    long getTotalExecAndFetchTimeNanos(@Nullable String filter, @Nullable Long minDurationNanos);

}