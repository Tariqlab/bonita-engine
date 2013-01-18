/**
 * Copyright (C) 2011 BonitaSoft S.A.
 * BonitaSoft, 32 rue Gustave Eiffel - 38000 Grenoble
 * This library is free software; you can redistribute it and/or modify it under the terms
 * of the GNU Lesser General Public License as published by the Free Software Foundation
 * version 2.1 of the License.
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth
 * Floor, Boston, MA 02110-1301, USA.
 **/
package org.bonitasoft.engine.persistence;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Baptiste Mesta
 */
public class PlatformMyBatisConfiguration extends AbstractMyBatisConfiguration {

    public PlatformMyBatisConfiguration(final Map<String, String> typeAliases, final List<String> mappers, final Map<String, String> classAliasMappings,
            final Map<String, String> classFieldAliasMappings, final Set<StatementMapping> statementMapping, final Map<String, String> dbStatementsMapping,
            final Map<String, String> entityMappings) {
        super(typeAliases, mappers, classAliasMappings, classFieldAliasMappings, statementMapping, dbStatementsMapping, entityMappings);
    }
}
