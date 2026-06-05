package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import mc.n;
import nc.t;
import qc.n0;
import qc.o0;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzenp implements zzett {
    private final Context zza;
    private final Bundle zzb;
    private final String zzc;
    private final String zzd;
    private final n0 zze;
    private final String zzf;
    private final zzcsz zzg;

    public zzenp(Context context, Bundle bundle, String str, String str2, n0 n0Var, String str3, zzcsz zzcszVar) {
        this.zza = context;
        this.zzb = bundle;
        this.zzc = str;
        this.zzd = str2;
        this.zze = n0Var;
        this.zzf = str3;
        this.zzg = zzcszVar;
    }

    private final void zzc(Bundle bundle) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfP)).booleanValue()) {
            try {
                r0 r0Var = n.D.f11577c;
                bundle.putString("_app_id", r0.G(this.zza));
            } catch (RemoteException | RuntimeException e10) {
                n.D.f11582h.zzw(e10, "AppStatsSignal_AppId");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcut) obj).zzb;
        bundle.putBundle("quality_signals", this.zzb);
        zzc(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final void zzb(Object obj) {
        Bundle bundle = ((zzcut) obj).zza;
        bundle.putBundle("quality_signals", this.zzb);
        bundle.putString("seq_num", this.zzc);
        if (!((o0) this.zze).k()) {
            bundle.putString("session_id", this.zzd);
        }
        bundle.putBoolean("client_purpose_one", !r0.k());
        zzc(bundle);
        String str = this.zzf;
        if (str != null) {
            Bundle bundle2 = new Bundle();
            zzcsz zzcszVar = this.zzg;
            bundle2.putLong("dload", zzcszVar.zzb(str));
            bundle2.putInt("pcc", zzcszVar.zza(str));
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzjX)).booleanValue()) {
            n nVar = n.D;
            if (nVar.f11582h.zza() > 0) {
                bundle.putInt("nrwv", nVar.f11582h.zza());
            }
        }
    }
}
