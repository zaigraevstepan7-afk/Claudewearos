package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import fc.u;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbsc extends od.a {
    public static final Parcelable.Creator<zzbsc> CREATOR = new zzbsd();
    public final int zza;
    public final int zzb;
    public final int zzc;

    public zzbsc(int i10, int i11, int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
    }

    public static zzbsc zza(u uVar) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbsc)) {
            zzbsc zzbscVar = (zzbsc) obj;
            if (zzbscVar.zzc == this.zzc && zzbscVar.zzb == this.zzb && zzbscVar.zza == this.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        return this.zza + "." + this.zzb + "." + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(i11);
        int i12 = this.zzb;
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(i12);
        int i13 = this.zzc;
        uk.c.k0(parcel, 3, 4);
        parcel.writeInt(i13);
        uk.c.j0(iH0, parcel);
    }
}
