package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Parcelable;
import android.os.RemoteException;
import fc.x;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nc.m1;
import nc.n3;
import nc.v2;
import rc.k;
import tc.s;
import wc.h;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbqu implements s {
    private final Date zza;
    private final int zzb;
    private final Set zzc;
    private final boolean zzd;
    private final Location zze;
    private final int zzf;
    private final zzbgc zzg;
    private final boolean zzi;
    private final List zzh = new ArrayList();
    private final Map zzj = new HashMap();

    public zzbqu(Date date, int i10, Set set, Location location, boolean z2, int i11, zzbgc zzbgcVar, List list, boolean z10, int i12, String str) {
        this.zza = date;
        this.zzb = i10;
        this.zzc = set;
        this.zze = location;
        this.zzd = z2;
        this.zzf = i11;
        this.zzg = zzbgcVar;
        this.zzi = z10;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.startsWith("custom:")) {
                    String[] strArrSplit = str2.split(":", 3);
                    if (strArrSplit.length == 3) {
                        if ("true".equals(strArrSplit[2])) {
                            this.zzj.put(strArrSplit[1], Boolean.TRUE);
                        } else if ("false".equals(strArrSplit[2])) {
                            this.zzj.put(strArrSplit[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.zzh.add(str2);
                }
            }
        }
    }

    public final float getAdVolume() {
        v2 v2VarC = v2.c();
        synchronized (v2VarC.f12253e) {
            m1 m1Var = v2VarC.f12254f;
            float fZze = 1.0f;
            if (m1Var == null) {
                return 1.0f;
            }
            try {
                fZze = m1Var.zze();
            } catch (RemoteException e10) {
                k.e("Unable to get app volume.", e10);
            }
            return fZze;
        }
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zza;
    }

    @Deprecated
    public final int getGender() {
        return this.zzb;
    }

    @Override // tc.d
    public final Set<String> getKeywords() {
        return this.zzc;
    }

    public final Location getLocation() {
        return this.zze;
    }

    @Override // tc.s
    public final ic.e getNativeAdOptions() {
        Parcelable.Creator<zzbgc> creator = zzbgc.CREATOR;
        ic.d dVar = new ic.d();
        zzbgc zzbgcVar = this.zzg;
        if (zzbgcVar == null) {
            return new ic.e(dVar);
        }
        int i10 = zzbgcVar.zza;
        if (i10 == 2) {
            dVar.f8493f = zzbgcVar.zze;
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    dVar.f8494g = zzbgcVar.zzg;
                    dVar.f8490c = zzbgcVar.zzh;
                }
            }
            n3 n3Var = zzbgcVar.zzf;
            if (n3Var != null) {
                dVar.f8492e = new x(n3Var);
            }
            dVar.f8493f = zzbgcVar.zze;
        }
        dVar.f8488a = zzbgcVar.zzb;
        dVar.f8489b = zzbgcVar.zzc;
        dVar.f8491d = zzbgcVar.zzd;
        return new ic.e(dVar);
    }

    @Override // tc.s
    public final h getNativeAdRequestOptions() {
        return zzbgc.zza(this.zzg);
    }

    public final boolean isAdMuted() {
        v2 v2VarC = v2.c();
        synchronized (v2VarC.f12253e) {
            m1 m1Var = v2VarC.f12254f;
            boolean zZzv = false;
            if (m1Var == null) {
                return false;
            }
            try {
                zZzv = m1Var.zzv();
            } catch (RemoteException e10) {
                k.e("Unable to get app mute state.", e10);
            }
            return zZzv;
        }
    }

    @Override // tc.d
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzi;
    }

    @Override // tc.d
    public final boolean isTesting() {
        return this.zzd;
    }

    @Override // tc.s
    public final boolean isUnifiedNativeAdRequested() {
        return this.zzh.contains("6");
    }

    @Override // tc.d
    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }

    @Override // tc.s
    public final Map zza() {
        return this.zzj;
    }

    @Override // tc.s
    public final boolean zzb() {
        return this.zzh.contains("3");
    }
}
