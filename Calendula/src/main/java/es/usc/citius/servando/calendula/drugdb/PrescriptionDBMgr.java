/*
 *    Calendula - An assistant for personal medication management.
 *    Copyright (C) 2016 CITIUS - USC
 *
 *    Calendula is free software; you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation; either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this software.  If not, see <http://www.gnu.org/licenses/>.
 */

package es.usc.citius.servando.calendula.drugdb;

import es.usc.citius.servando.calendula.persistence.Prescription;
import es.usc.citius.servando.calendula.persistence.Presentation;

/**
 * Created by joseangel.pineiro on 7/27/15.
 */
public abstract class PrescriptionDBMgr {

    private String id;
    private String displayName;
    private String description;


    public String id() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String displayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String description() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    protected boolean getBoolean(String s) {
        return s.contains("1");
    }

    public abstract boolean hasWebProspects();

    public abstract String getProspectURL(Prescription p);

    public abstract Prescription fromCsv(String line, String separator);

    public abstract Presentation expected(Prescription p);

    public abstract Presentation expected(String name, String content);

    public abstract String shortName(Prescription p);

}
