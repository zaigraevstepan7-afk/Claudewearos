package jg;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e implements od.b {
    public static final Parcelable.Creator<e> CREATOR = new c(1);

    /* renamed from: a, reason: collision with root package name */
    public final long f8879a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8880b;

    public e(long j, long j4) {
        this.f8879a = j;
        this.f8880b = j4;
    }

    public static e a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new e(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 8);
        parcel.writeLong(this.f8879a);
        uk.c.k0(parcel, 2, 8);
        parcel.writeLong(this.f8880b);
        uk.c.j0(iH0, parcel);
    }
}
