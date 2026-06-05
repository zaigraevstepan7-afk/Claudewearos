package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import fc.x;
import nc.n3;
import wc.g;
import wc.h;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbgc extends od.a {
    public static final Parcelable.Creator<zzbgc> CREATOR = new zzbgd();
    public final int zza;
    public final boolean zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final n3 zzf;
    public final boolean zzg;
    public final int zzh;
    public final int zzi;
    public final boolean zzj;
    public final int zzk;

    public zzbgc(int i10, boolean z2, int i11, boolean z10, int i12, n3 n3Var, boolean z11, int i13, int i14, boolean z12, int i15) {
        this.zza = i10;
        this.zzb = z2;
        this.zzc = i11;
        this.zzd = z10;
        this.zze = i12;
        this.zzf = n3Var;
        this.zzg = z11;
        this.zzh = i13;
        this.zzj = z12;
        this.zzi = i14;
        this.zzk = i15;
    }

    public static h zza(zzbgc zzbgcVar) {
        g gVar = new g();
        gVar.f19257a = false;
        gVar.f19258b = 0;
        gVar.f19259c = false;
        int i10 = 1;
        gVar.f19261e = 1;
        gVar.f19262f = false;
        gVar.f19263g = false;
        gVar.f19264h = 0;
        gVar.f19265i = 1;
        if (zzbgcVar == null) {
            return new h(gVar);
        }
        int i11 = zzbgcVar.zza;
        if (i11 == 2) {
            gVar.f19261e = zzbgcVar.zze;
        } else {
            if (i11 != 3) {
                if (i11 == 4) {
                    gVar.f19262f = zzbgcVar.zzg;
                    gVar.f19258b = zzbgcVar.zzh;
                    int i12 = zzbgcVar.zzi;
                    gVar.f19263g = zzbgcVar.zzj;
                    gVar.f19264h = i12;
                    int i13 = zzbgcVar.zzk;
                    if (i13 != 0) {
                        if (i13 == 2) {
                            i10 = 3;
                        } else if (i13 == 1) {
                            i10 = 2;
                        }
                    }
                    gVar.f19265i = i10;
                }
            }
            n3 n3Var = zzbgcVar.zzf;
            if (n3Var != null) {
                gVar.f19260d = new x(n3Var);
            }
            gVar.f19261e = zzbgcVar.zze;
        }
        gVar.f19257a = zzbgcVar.zzb;
        gVar.f19259c = zzbgcVar.zzd;
        return new h(gVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(i11);
        boolean z2 = this.zzb;
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(z2 ? 1 : 0);
        int i12 = this.zzc;
        uk.c.k0(parcel, 3, 4);
        parcel.writeInt(i12);
        boolean z10 = this.zzd;
        uk.c.k0(parcel, 4, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i13 = this.zze;
        uk.c.k0(parcel, 5, 4);
        parcel.writeInt(i13);
        uk.c.b0(parcel, 6, this.zzf, i10, false);
        boolean z11 = this.zzg;
        uk.c.k0(parcel, 7, 4);
        parcel.writeInt(z11 ? 1 : 0);
        int i14 = this.zzh;
        uk.c.k0(parcel, 8, 4);
        parcel.writeInt(i14);
        int i15 = this.zzi;
        uk.c.k0(parcel, 9, 4);
        parcel.writeInt(i15);
        boolean z12 = this.zzj;
        uk.c.k0(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        int i16 = this.zzk;
        uk.c.k0(parcel, 11, 4);
        parcel.writeInt(i16);
        uk.c.j0(iH0, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public zzbgc(ic.e eVar) {
        boolean z2 = eVar.f8495a;
        int i10 = eVar.f8496b;
        boolean z10 = eVar.f8498d;
        int i11 = eVar.f8499e;
        x xVar = eVar.f8500f;
        this(4, z2, i10, z10, i11, xVar != null ? new n3(xVar) : null, eVar.f8501g, eVar.f8497c, 0, false, 0);
    }
}
