package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import mc.n;
import nc.t;
import nc.w1;
import org.json.JSONException;
import org.json.JSONObject;
import pc.m;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdvm implements m, zzcgu {
    private final Context zza;
    private final rc.a zzb;
    private zzdvb zzc;
    private zzcfe zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private w1 zzh;
    private boolean zzi;

    public zzdvm(Context context, rc.a aVar) {
        this.zza = context;
        this.zzb = aVar;
    }

    public static /* synthetic */ void zzh(zzdvm zzdvmVar, String str) throws JSONException {
        JSONObject jSONObjectZze = zzdvmVar.zzc.zze();
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObjectZze.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        zzdvmVar.zzd.zzb("window.inspectorInfo", jSONObjectZze.toString());
    }

    private final synchronized boolean zzl(w1 w1Var) {
        if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzjg)).booleanValue()) {
            int i10 = l0.f13401b;
            k.g("Ad inspector had an internal error.");
            try {
                w1Var.zze(zzfdp.zzd(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.zzc == null) {
            int i11 = l0.f13401b;
            k.g("Ad inspector had an internal error.");
            try {
                n.D.f11582h.zzw(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                w1Var.zze(zzfdp.zzd(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.zze && !this.zzf) {
            n.D.f11584k.getClass();
            if (System.currentTimeMillis() >= this.zzg + ((Integer) r1.f12230c.zzb(zzbdc.zzjj)).intValue()) {
                return true;
            }
        }
        int i12 = l0.f13401b;
        k.g("Ad inspector cannot be opened because it is already open.");
        try {
            w1Var.zze(zzfdp.zzd(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgu
    public final synchronized void zza(boolean z2, int i10, String str, String str2) {
        if (z2) {
            l0.k("Ad inspector loaded.");
            this.zze = true;
            zzk("");
            return;
        }
        int i11 = l0.f13401b;
        k.g("Ad inspector failed to load.");
        try {
            n.D.f11582h.zzw(new Exception("Failed to load UI. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2), "InspectorUi.onAdWebViewFinishedLoading 0");
            w1 w1Var = this.zzh;
            if (w1Var != null) {
                w1Var.zze(zzfdp.zzd(17, null, null));
            }
        } catch (RemoteException e10) {
            n.D.f11582h.zzw(e10, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.zzi = true;
        this.zzd.destroy();
    }

    @Override // pc.m
    public final synchronized void zzdt() {
        this.zzf = true;
        zzk("");
    }

    @Override // pc.m
    public final synchronized void zzdw(int i10) {
        this.zzd.destroy();
        if (!this.zzi) {
            l0.k("Inspector closed.");
            w1 w1Var = this.zzh;
            if (w1Var != null) {
                try {
                    w1Var.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.zzf = false;
        this.zze = false;
        this.zzg = 0L;
        this.zzi = false;
        this.zzh = null;
    }

    public final Activity zzg() {
        zzcfe zzcfeVar = this.zzd;
        if (zzcfeVar == null || zzcfeVar.zzaE()) {
            return null;
        }
        return this.zzd.zzi();
    }

    public final void zzi(zzdvb zzdvbVar) {
        this.zzc = zzdvbVar;
    }

    public final synchronized void zzj(w1 w1Var, zzbkx zzbkxVar, zzbkq zzbkqVar, zzbke zzbkeVar) {
        if (zzl(w1Var)) {
            try {
                n nVar = n.D;
                zzcfr zzcfrVar = nVar.f11578d;
                zzcfe zzcfeVarZza = zzcfr.zza(this.zza, zzcgy.zza(), "", false, false, null, null, this.zzb, null, null, null, zzbca.zza(), null, null, null, null, null);
                this.zzd = zzcfeVarZza;
                zzcgw zzcgwVarZzN = zzcfeVarZza.zzN();
                if (zzcgwVarZzN == null) {
                    int i10 = l0.f13401b;
                    k.g("Failed to obtain a web view for the ad inspector");
                    try {
                        nVar.f11582h.zzw(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                        w1Var.zze(zzfdp.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e10) {
                        n.D.f11582h.zzw(e10, "InspectorUi.openInspector 3");
                        return;
                    }
                }
                this.zzh = w1Var;
                Context context = this.zza;
                zzcgwVarZzN.zzX(null, null, null, null, null, false, null, null, null, null, null, null, null, zzbkxVar, null, new zzbkw(context), zzbkqVar, zzbkeVar, null);
                zzcgwVarZzN.zzC(this);
                this.zzd.loadUrl((String) t.f12227d.f12230c.zzb(zzbdc.zzjh));
                y9.a.m(context, new AdOverlayInfoParcel(this, this.zzd, this.zzb), true, null);
                nVar.f11584k.getClass();
                this.zzg = System.currentTimeMillis();
            } catch (zzcfq e11) {
                int i11 = l0.f13401b;
                k.h("Failed to obtain a web view for the ad inspector", e11);
                try {
                    n.D.f11582h.zzw(e11, "InspectorUi.openInspector 0");
                    w1Var.zze(zzfdp.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e12) {
                    n.D.f11582h.zzw(e12, "InspectorUi.openInspector 1");
                }
            }
        }
    }

    public final synchronized void zzk(final String str) {
        if (this.zze && this.zzf) {
            zzcad.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvl
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    zzdvm.zzh(this.zza, str);
                }
            });
        }
    }

    @Override // pc.m
    public final void zzdH() {
    }

    @Override // pc.m
    public final void zzdk() {
    }

    @Override // pc.m
    public final void zzds() {
    }

    @Override // pc.m
    public final void zzdv() {
    }
}
