package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.e0;
import java.util.Arrays;
import org.json.JSONArray;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbwm extends od.a {
    public static final Parcelable.Creator<zzbwm> CREATOR = new zzbwn();
    public final String zza;
    public final int zzb;

    public zzbwm(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    public static zzbwm zza(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzbwm(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbwm)) {
            zzbwm zzbwmVar = (zzbwm) obj;
            if (e0.l(this.zza, zzbwmVar.zza)) {
                if (e0.l(Integer.valueOf(this.zzb), Integer.valueOf(zzbwmVar.zzb))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 2, str, false);
        int i11 = this.zzb;
        uk.c.k0(parcel, 3, 4);
        parcel.writeInt(i11);
        uk.c.j0(iH0, parcel);
    }
}
