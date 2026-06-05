package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbsw extends wc.d {
    private final zzbgn zza;
    private final Drawable zzb;
    private final Uri zzc;
    private final double zzd;
    private final int zze;
    private final int zzf;

    public zzbsw(zzbgn zzbgnVar) {
        double dZzb;
        int iZzd;
        xd.a aVarZzf;
        this.zza = zzbgnVar;
        Uri uriZze = null;
        try {
            aVarZzf = zzbgnVar.zzf();
        } catch (RemoteException e10) {
            k.e("", e10);
        }
        Drawable drawable = aVarZzf != null ? (Drawable) xd.b.u(aVarZzf) : null;
        this.zzb = drawable;
        try {
            uriZze = this.zza.zze();
        } catch (RemoteException e11) {
            k.e("", e11);
        }
        this.zzc = uriZze;
        try {
            dZzb = this.zza.zzb();
        } catch (RemoteException e12) {
            k.e("", e12);
            dZzb = 1.0d;
        }
        this.zzd = dZzb;
        int iZzc = -1;
        try {
            iZzd = this.zza.zzd();
        } catch (RemoteException e13) {
            k.e("", e13);
            iZzd = -1;
        }
        this.zze = iZzd;
        try {
            iZzc = this.zza.zzc();
        } catch (RemoteException e14) {
            k.e("", e14);
        }
        this.zzf = iZzc;
    }

    public final Drawable getDrawable() {
        return this.zzb;
    }

    public final double getScale() {
        return this.zzd;
    }

    public final Uri getUri() {
        return this.zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    public final int zzb() {
        return this.zze;
    }
}
