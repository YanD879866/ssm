package yand.util.dyDataBase;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 多数据源的配置
 * @author ninihao
 *
 */
public class DynamicDataSource extends AbstractRoutingDataSource {


	@Override
	protected Object determineCurrentLookupKey() {
		return DataSourceContextHolder.getDataSourceType();
	}

}
