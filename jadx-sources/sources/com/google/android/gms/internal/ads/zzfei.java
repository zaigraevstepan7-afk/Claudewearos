package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfei extends od.a {
    public static final Parcelable.Creator<zzfei> CREATOR = new zzfej();
    public final Context zza;
    public final zzfef zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    private final zzfef[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzfei(int i10, int i11, int i12, int i13, String str, int i14, int i15) {
        zzfef[] zzfefVarArrValues = zzfef.values();
        this.zzh = zzfefVarArrValues;
        int[] iArrZza = zzfeg.zza();
        this.zzl = iArrZza;
        int[] iArrZza2 = zzfeh.zza();
        this.zzm = iArrZza2;
        this.zza = null;
        this.zzi = i10;
        this.zzb = zzfefVarArrValues[i10];
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = str;
        this.zzj = i14;
        this.zzg = iArrZza[i14];
        this.zzk = i15;
        int i16 = iArrZza2[i15];
    }

    public static zzfei zza(zzfef zzfefVar, Context context) {
        if (zzfefVar == zzfef.Rewarded) {
            zzbct zzbctVar = zzbdc.zzgx;
            t tVar = t.f12227d;
            return new zzfei(context, zzfefVar, ((Integer) tVar.f12230c.zzb(zzbctVar)).intValue(), ((Integer) tVar.f12230c.zzb(zzbdc.zzgD)).intValue(), ((Integer) tVar.f12230c.zzb(zzbdc.zzgF)).intValue(), (String) tVar.f12230c.zzb(zzbdc.zzgH), (String) tVar.f12230c.zzb(zzbdc.zzgz), (String) tVar.f12230c.zzb(zzbdc.zzgB));
        }
        if (zzfefVar == zzfef.Interstitial) {
            zzbct zzbctVar2 = zzbdc.zzgy;
            t tVar2 = t.f12227d;
            return new zzfei(context, zzfefVar, ((Integer) tVar2.f12230c.zzb(zzbctVar2)).intValue(), ((Integer) tVar2.f12230c.zzb(zzbdc.zzgE)).intValue(), ((Integer) tVar2.f12230c.zzb(zzbdc.zzgG)).intValue(), (String) tVar2.f12230c.zzb(zzbdc.zzgI), (String) tVar2.f12230c.zzb(zzbdc.zzgA), (String) tVar2.f12230c.zzb(zzbdc.zzgC));
        }
        if (zzfefVar != zzfef.AppOpen) {
            return null;
        }
        zzbct zzbctVar3 = zzbdc.zzgL;
        t tVar3 = t.f12227d;
        return new zzfei(context, zzfefVar, ((Integer) tVar3.f12230c.zzb(zzbctVar3)).intValue(), ((Integer) tVar3.f12230c.zzb(zzbdc.zzgN)).intValue(), ((Integer) tVar3.f12230c.zzb(zzbdc.zzgO)).intValue(), (String) tVar3.f12230c.zzb(zzbdc.zzgJ), (String) tVar3.f12230c.zzb(zzbdc.zzgK), (String) tVar3.f12230c.zzb(zzbdc.zzgM));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zzi;
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(i11);
        int i12 = this.zzc;
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(i12);
        int i13 = this.zzd;
        uk.c.k0(parcel, 3, 4);
        parcel.writeInt(i13);
        int i14 = this.zze;
        uk.c.k0(parcel, 4, 4);
        parcel.writeInt(i14);
        uk.c.c0(parcel, 5, this.zzf, false);
        int i15 = this.zzj;
        uk.c.k0(parcel, 6, 4);
        parcel.writeInt(i15);
        int i16 = this.zzk;
        uk.c.k0(parcel, 7, 4);
        parcel.writeInt(i16);
        uk.c.j0(iH0, parcel);
    }

    private zzfei(Context context, zzfef zzfefVar, int i10, int i11, int i12, String str, String str2, String str3) {
        int i13;
        this.zzh = zzfef.values();
        this.zzl = zzfeg.zza();
        this.zzm = zzfeh.zza();
        this.zza = context;
        this.zzi = zzfefVar.ordinal();
        this.zzb = zzfefVar;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = str;
        if ("oldest".equals(str2)) {
            i13 = 1;
        } else {
            i13 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.zzg = i13;
        this.zzj = i13 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}
