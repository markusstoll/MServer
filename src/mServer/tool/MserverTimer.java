/*
 * MediathekView
 * Copyright (C) 2008 W. Xaver
 * W.Xaver[at]googlemail.com
 * http://zdfmediathk.sourceforge.net/
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package mServer.tool;

public class MserverTimer implements Runnable {

    private final int WARTEZEIT = 1000 * 10; // 10 Sekunde

    public void ping() {
    }

    @Override
    public synchronized void run() {
        while (true) {
            ping();
            schlafen();
        }
    }

    private void schlafen() {
        try {
            Thread.sleep(WARTEZEIT);
        } catch (InterruptedException e) {
        }
    }
}
