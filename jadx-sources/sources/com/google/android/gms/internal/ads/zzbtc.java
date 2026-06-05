package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import fc.n;
import java.util.List;
import nc.z2;
import rc.k;
import wc.j;
import wc.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbtc implements m {
    private final zzbhh zza;
    private j zzb;

    public zzbtc(zzbhh zzbhhVar) {
        this.zza = zzbhhVar;
    }

    public final void destroy() {
        try {
            this.zza.zzl();
        } catch (RemoteException e10) {
            k.e("", e10);
        }
    }

    public final List<String> getAvailableAssetNames() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e10) {
            k.e("", e10);
            return null;
        }
    }

    public final String getCustomFormatId() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e10) {
            k.e("", e10);
            return null;
        }
    }

    public final j getDisplayOpenMeasurement() {
        try {
            if (this.zzb == null) {
                zzbhh zzbhhVar = this.zza;
                if (zzbhhVar.zzq()) {
                    this.zzb = new zzbsv(zzbhhVar);
                }
            }
        } catch (RemoteException e10) {
            k.e("", e10);
        }
        return this.zzb;
    }

    public final wc.d getImage(String str) {
        try {
            zzbgn zzbgnVarZzg = this.zza.zzg(str);
            if (zzbgnVarZzg != null) {
                return new zzbsw(zzbgnVarZzg);
            }
            return null;
        } catch (RemoteException e10) {
            k.e("", e10);
            return null;
        }
    }

    public final n getMediaContent() {
        try {
            zzbhh zzbhhVar = this.zza;
            if (zzbhhVar.zzf() != null) {
                return new z2(zzbhhVar.zzf(), zzbhhVar);
            }
            return null;
        } catch (RemoteException e10) {
            k.e("", e10);
            return null;
        }
    }

    public final CharSequence getText(String str) {
        try {
            return this.zza.zzj(str);
        } catch (RemoteException e10) {
            k.e("", e10);
            return null;
        }
    }

    public final void performClick(String str) {
        try {
            this.zza.zzn(str);
        } catch (RemoteException e10) {
            k.e("", e10);
        }
    }

    public final void recordImpression() {
        try {
            this.zza.zzo();
        } catch (RemoteException e10) {
            k.e("", e10);
        }
    }
}
