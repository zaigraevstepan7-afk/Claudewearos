package sd;

import com.google.android.gms.common.internal.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class c extends b implements od.b {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        b bVar = (b) obj;
        for (a aVar : getFieldMappings().values()) {
            if (isFieldSet(aVar)) {
                if (!bVar.isFieldSet(aVar) || !e0.l(getFieldValue(aVar), bVar.getFieldValue(aVar))) {
                    return false;
                }
            } else if (bVar.isFieldSet(aVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // sd.b
    public Object getValueObject(String str) {
        return null;
    }

    public int hashCode() {
        int iHashCode = 0;
        for (a aVar : getFieldMappings().values()) {
            if (isFieldSet(aVar)) {
                Object fieldValue = getFieldValue(aVar);
                e0.i(fieldValue);
                iHashCode = (iHashCode * 31) + fieldValue.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // sd.b
    public boolean isPrimitiveFieldSet(String str) {
        return false;
    }
}
