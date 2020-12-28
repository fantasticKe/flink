package org.apache.flink.connector.jdbc.internal.converter;

import org.apache.flink.table.types.logical.RowType;

/**
 * Runtime converter that responsible to convert between JDBC object and Flink internal object for ClickHouse.
 */
public class ClickHouseRowConverter extends AbstractJdbcRowConverter{

	private static final long serialVersionUID = 1L;

	public ClickHouseRowConverter(RowType rowType) {
		super(rowType);
	}

	@Override
	public String converterName() {
		return "ClickHouse";
	}
}
