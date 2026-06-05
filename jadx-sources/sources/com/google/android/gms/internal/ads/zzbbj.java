package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.InputStream;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbbj extends od.a {
    public static final Parcelable.Creator<zzbbj> CREATOR = new zzbbk();
    private ParcelFileDescriptor zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final boolean zze;

    public zzbbj(ParcelFileDescriptor parcelFileDescriptor, boolean z2, boolean z10, long j, boolean z11) {
        this.zza = parcelFileDescriptor;
        this.zzb = z2;
        this.zzc = z10;
        this.zzd = j;
        this.zze = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.b0(parcel, 2, zzb(), i10, false);
        boolean zZzd = zzd();
        uk.c.k0(parcel, 3, 4);
        parcel.writeInt(zZzd ? 1 : 0);
        boolean zZzf = zzf();
        uk.c.k0(parcel, 4, 4);
        parcel.writeInt(zZzf ? 1 : 0);
        long jZza = zza();
        uk.c.k0(parcel, 5, 8);
        parcel.writeLong(jZza);
        boolean zZzg = zzg();
        uk.c.k0(parcel, 6, 4);
        parcel.writeInt(zZzg ? 1 : 0);
        uk.c.j0(iH0, parcel);
    }

    public final synchronized long zza() {
        return this.zzd;
    }

    public final synchronized ParcelFileDescriptor zzb() {
        return this.zza;
    }

    public final synchronized InputStream zzc() {
        if (this.zza == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.zza);
        this.zza = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean zzd() {
        return this.zzb;
    }

    public final synchronized boolean zze() {
        return this.zza != null;
    }

    public final synchronized boolean zzf() {
        return this.zzc;
    }

    public final synchronized boolean zzg() {
        return this.zze;
    }

    public zzbbj() {
        this(null, false, false, 0L, false);
    }
}
