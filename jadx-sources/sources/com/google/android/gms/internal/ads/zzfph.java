package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfph extends od.a {
    public static final Parcelable.Creator<zzfph> CREATOR = new zzfpi();
    public final int zza;
    private zzato zzb = null;
    private byte[] zzc;

    public zzfph(int i10, byte[] bArr) {
        this.zza = i10;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        zzato zzatoVar = this.zzb;
        if (zzatoVar != null || this.zzc == null) {
            if (zzatoVar == null || this.zzc != null) {
                if (zzatoVar != null && this.zzc != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (zzatoVar != null || this.zzc != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(i11);
        byte[] bArrZzaV = this.zzc;
        if (bArrZzaV == null) {
            bArrZzaV = this.zzb.zzaV();
        }
        uk.c.V(parcel, 2, bArrZzaV, false);
        uk.c.j0(iH0, parcel);
    }

    public final zzato zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzato.zzd(this.zzc, zzgyf.zza());
                this.zzc = null;
            } catch (zzgzk | NullPointerException e10) {
                throw new IllegalStateException(e10);
            }
        }
        zzb();
        return this.zzb;
    }
}
