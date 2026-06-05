package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
import od.a;
import uk.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzba extends a {
    final LocationRequest zzb;
    final List<g> zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final String zzh;
    final boolean zzi;
    boolean zzj;
    String zzk;
    long zzl;
    static final List<g> zza = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<zzba> CREATOR = new zzbb();

    public zzba(LocationRequest locationRequest, List<g> list, String str, boolean z2, boolean z10, boolean z11, String str2, boolean z12, boolean z13, String str3, long j) {
        this.zzb = locationRequest;
        this.zzc = list;
        this.zzd = str;
        this.zze = z2;
        this.zzf = z10;
        this.zzg = z11;
        this.zzh = str2;
        this.zzi = z12;
        this.zzj = z13;
        this.zzk = str3;
        this.zzl = j;
    }

    public static zzba zza(String str, LocationRequest locationRequest) {
        return new zzba(locationRequest, zza, null, false, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzba) {
            zzba zzbaVar = (zzba) obj;
            if (e0.l(this.zzb, zzbaVar.zzb) && e0.l(this.zzc, zzbaVar.zzc) && e0.l(this.zzd, zzbaVar.zzd) && this.zze == zzbaVar.zze && this.zzf == zzbaVar.zzf && this.zzg == zzbaVar.zzg && e0.l(this.zzh, zzbaVar.zzh) && this.zzi == zzbaVar.zzi && this.zzj == zzbaVar.zzj && e0.l(this.zzk, zzbaVar.zzk)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.zzb);
        if (this.zzd != null) {
            sb2.append(" tag=");
            sb2.append(this.zzd);
        }
        if (this.zzh != null) {
            sb2.append(" moduleId=");
            sb2.append(this.zzh);
        }
        if (this.zzk != null) {
            sb2.append(" contextAttributionTag=");
            sb2.append(this.zzk);
        }
        sb2.append(" hideAppOps=");
        sb2.append(this.zze);
        sb2.append(" clients=");
        sb2.append(this.zzc);
        sb2.append(" forceCoarseLocation=");
        sb2.append(this.zzf);
        if (this.zzg) {
            sb2.append(" exemptFromBackgroundThrottle");
        }
        if (this.zzi) {
            sb2.append(" locationSettingsIgnored");
        }
        if (this.zzj) {
            sb2.append(" inaccurateLocationsDelayed");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = c.h0(20293, parcel);
        c.b0(parcel, 1, this.zzb, i10, false);
        c.g0(parcel, 5, this.zzc, false);
        c.c0(parcel, 6, this.zzd, false);
        boolean z2 = this.zze;
        c.k0(parcel, 7, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z10 = this.zzf;
        c.k0(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.zzg;
        c.k0(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        c.c0(parcel, 10, this.zzh, false);
        boolean z12 = this.zzi;
        c.k0(parcel, 11, 4);
        parcel.writeInt(z12 ? 1 : 0);
        boolean z13 = this.zzj;
        c.k0(parcel, 12, 4);
        parcel.writeInt(z13 ? 1 : 0);
        c.c0(parcel, 13, this.zzk, false);
        long j = this.zzl;
        c.k0(parcel, 14, 8);
        parcel.writeLong(j);
        c.j0(iH0, parcel);
    }

    public final zzba zzb(long j) {
        LocationRequest locationRequest = this.zzb;
        long j4 = locationRequest.A;
        long j10 = locationRequest.f3746b;
        if (j4 < j10) {
            j4 = j10;
        }
        if (j4 <= j10) {
            this.zzl = 10000L;
            return this;
        }
        LocationRequest locationRequest2 = this.zzb;
        long j11 = locationRequest2.f3746b;
        long j12 = locationRequest2.A;
        if (j12 < j11) {
            j12 = j11;
        }
        StringBuilder sb2 = new StringBuilder(120);
        sb2.append("could not set max age when location batching is requested, interval=");
        sb2.append(j11);
        sb2.append("maxWaitTime=");
        sb2.append(j12);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final zzba zzc(String str) {
        this.zzk = str;
        return this;
    }

    public final zzba zzd(boolean z2) {
        this.zzj = true;
        return this;
    }
}
