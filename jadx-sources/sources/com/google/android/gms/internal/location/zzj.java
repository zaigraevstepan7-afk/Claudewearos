package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.util.VisibleForTesting;
import ee.b0;
import java.util.Collections;
import java.util.List;
import od.a;
import t.m1;
import uk.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzj extends a {
    final b0 zzc;
    final List<g> zzd;
    final String zze;

    @VisibleForTesting
    static final List<g> zza = Collections.EMPTY_LIST;
    static final b0 zzb = new b0(true, 50, 0.0f, Long.MAX_VALUE, f.API_PRIORITY_OTHER);
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();

    public zzj(b0 b0Var, List<g> list, String str) {
        this.zzc = b0Var;
        this.zzd = list;
        this.zze = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        return e0.l(this.zzc, zzjVar.zzc) && e0.l(this.zzd, zzjVar.zzd) && e0.l(this.zze, zzjVar.zze);
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(this.zzd);
        String str = this.zze;
        int length = strValueOf.length();
        StringBuilder sb2 = new StringBuilder(length + 77 + strValueOf2.length() + String.valueOf(str).length());
        m1.s(sb2, "DeviceOrientationRequestInternal{deviceOrientationRequest=", strValueOf, ", clients=", strValueOf2);
        sb2.append(", tag='");
        sb2.append(str);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = c.h0(20293, parcel);
        c.b0(parcel, 1, this.zzc, i10, false);
        c.g0(parcel, 2, this.zzd, false);
        c.c0(parcel, 3, this.zze, false);
        c.j0(iH0, parcel);
    }
}
