package de;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.e0;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends od.a {
    public static final Parcelable.Creator<h> CREATOR = new dd.d(8);

    /* renamed from: a, reason: collision with root package name */
    public final d f5108a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5109b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5110c;

    public h(d dVar, String str, String str2) {
        e0.i(dVar);
        this.f5108a = dVar;
        this.f5110c = str;
        this.f5109b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        String str = hVar.f5109b;
        String str2 = hVar.f5110c;
        String str3 = this.f5110c;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        if (!this.f5108a.equals(hVar.f5108a)) {
            return false;
        }
        String str4 = this.f5109b;
        if (str4 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str4.equals(str)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f5110c;
        int iHashCode = this.f5108a.hashCode() + (((str == null ? 0 : str.hashCode()) + 31) * 31);
        String str2 = this.f5109b;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() throws JSONException {
        d dVar = this.f5108a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(dVar.f5098b, 11));
            f fVar = dVar.f5099c;
            if (fVar != f.UNKNOWN) {
                jSONObject.put("version", fVar.f5103a);
            }
            List list = dVar.f5100d;
            if (list != null) {
                jSONObject.put("transports", list.toString());
            }
            String str = this.f5110c;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.f5109b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.b0(parcel, 2, this.f5108a, i10, false);
        uk.c.c0(parcel, 3, this.f5110c, false);
        uk.c.c0(parcel, 4, this.f5109b, false);
        uk.c.j0(iH0, parcel);
    }
}
