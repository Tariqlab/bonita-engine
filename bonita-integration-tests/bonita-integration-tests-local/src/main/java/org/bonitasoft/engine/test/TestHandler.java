/**
 * Copyright (C) 2016 Bonitasoft S.A.
 * Bonitasoft, 32 rue Gustave Eiffel - 38000 Grenoble
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

package org.bonitasoft.engine.test;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

/**
 * @author Baptiste Mesta
 */
public class TestHandler extends Handler {

    private StringBuilder stb = new StringBuilder();

    @Override
    public void publish(LogRecord record) {
        stb.append(record.getMessage()).append('\n');
    }

    @Override
    public void flush() {

    }

    @Override
    public void close() throws SecurityException {
        stb = null;
    }

    public String getLogs() {
        return stb.toString();
    }
}
