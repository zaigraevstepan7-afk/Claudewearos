package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.internal.e0;
import nc.g;
import nc.p;
import nc.s;
import nc.t;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzblj {
    private final Context zza;
    private final jc.b zzb;
    private zzblf zzc;

    public zzblj(Context context, jc.b bVar) {
        e0.i(context);
        e0.i(bVar);
        this.zza = context;
        this.zzb = bVar;
        zzbdc.zza(context);
    }

    public static final boolean zzc(String str) {
        zzbct zzbctVar = zzbdc.zzkh;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            e0.i(str);
            if (str.length() > ((Integer) tVar.f12230c.zzb(zzbdc.zzkj)).intValue()) {
                k.b("H5 GMSG exceeds max length");
                return false;
            }
            Uri uri = Uri.parse(str);
            if ("gmsg".equals(uri.getScheme()) && "mobileads.google.com".equals(uri.getHost()) && "/h5ads".equals(uri.getPath())) {
                return true;
            }
        }
        return false;
    }

    private final void zzd() {
        if (this.zzc != null) {
            return;
        }
        Context context = this.zza;
        p pVar = s.f12202f.f12204b;
        zzbpk zzbpkVar = new zzbpk();
        jc.b bVar = this.zzb;
        pVar.getClass();
        this.zzc = (zzblf) new g(context, zzbpkVar, bVar).d(context, false);
    }

    public final void zza() {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzkh)).booleanValue()) {
            zzd();
            zzblf zzblfVar = this.zzc;
            if (zzblfVar != null) {
                try {
                    zzblfVar.zze();
                } catch (RemoteException e10) {
                    k.i("#007 Could not call remote method.", e10);
                }
            }
        }
    }

    public final boolean zzb(String str) {
        if (!zzc(str)) {
            return false;
        }
        zzd();
        zzblf zzblfVar = this.zzc;
        if (zzblfVar == null) {
            return false;
        }
        try {
            zzblfVar.zzf(str);
            return true;
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
            return true;
        }
    }
}
