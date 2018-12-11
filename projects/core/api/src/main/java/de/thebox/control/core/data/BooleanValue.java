/* 
 * Copyright 2016-18 ISC Konstanz
 * 
 * This file is part of TH-E-EMS.
 * For more information visit https://github.com/isc-konstanz/TH-E-EMS
 * 
 * TH-E-EMS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * TH-E-EMS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with TH-E-EMS.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.thebox.control.core.data;

import java.util.Objects;

public class BooleanValue extends Value {

	private final boolean value;

	public BooleanValue(boolean value, long timestamp) {
		super(ValueType.BOOLEAN, timestamp);
		this.value = value;
	}

	public BooleanValue(boolean value) {
		this(value, System.currentTimeMillis());
	}

	@Override
	public double doubleValue() {
		if (value) {
			return 1.0;
		}
		else {
			return 0.0;
		}
	}

	@Override
	public float floatValue() {
		if (value) {
			return 1.0f;
		}
		else {
			return 0.0f;
		}
	}

	@Override
	public long longValue() {
		if (value) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public int intValue() {
		if (value) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public short shortValue() {
		if (value) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public byte byteValue() {
		if (value) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean booleanValue() {
		return value;
	}

	@Override
	public String toString() {
		return Boolean.toString(value);
	}

	@Override
	public boolean equals(Object o) {
		if (o == this) return true;
		if (!(o instanceof BooleanValue)) {
			return false;
		}
		BooleanValue user = (BooleanValue) o;
		return Objects.equals(time, user.time) &&
				Objects.equals(value, user.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(type, time, value);
	}

	public static BooleanValue emptyValue() {
		return new BooleanValue(false);
	}

}
