package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import mc.n;
import nc.h2;
import nc.q3;
import nc.t;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdrg implements zzdaq, nc.a, zzcwl, zzcvv, zzcyh {
    private final Context zzc;
    private final zzfdg zzd;
    private final zzdsc zze;
    private final zzfcf zzf;
    private final zzfbt zzg;
    private final zzebs zzh;
    private final String zzi;
    private Boolean zzk;
    private long zzj = -1;
    final AtomicBoolean zza = new AtomicBoolean(false);
    final AtomicBoolean zzb = new AtomicBoolean(false);
    private final boolean zzl = ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzgU)).booleanValue();

    public zzdrg(Context context, zzfdg zzfdgVar, zzdsc zzdscVar, zzfcf zzfcfVar, zzfbt zzfbtVar, zzebs zzebsVar, String str) {
        this.zzc = context;
        this.zzd = zzfdgVar;
        this.zze = zzdscVar;
        this.zzf = zzfcfVar;
        this.zzg = zzfbtVar;
        this.zzh = zzebsVar;
        this.zzi = str;
    }

    private final zzdsb zzf(String str) {
        zzfcf zzfcfVar = this.zzf;
        zzfce zzfceVar = zzfcfVar.zzb;
        zzdsb zzdsbVarZza = this.zze.zza();
        zzdsbVarZza.zzd(zzfceVar.zzb);
        zzfbt zzfbtVar = this.zzg;
        zzdsbVarZza.zzc(zzfbtVar);
        zzdsbVarZza.zzb("action", str);
        zzdsbVarZza.zzb("ad_format", this.zzi.toUpperCase(Locale.ROOT));
        List list = zzfbtVar.zzt;
        if (!list.isEmpty()) {
            zzdsbVarZza.zzb("ancn", (String) list.get(0));
        }
        if (zzfbtVar.zzb()) {
            Context context = this.zzc;
            n nVar = n.D;
            zzdsbVarZza.zzb("device_connectivity", true != nVar.f11582h.zzA(context) ? "offline" : p.a.ONLINE_EXTRAS_KEY);
            nVar.f11584k.getClass();
            zzdsbVarZza.zzb("event_timestamp", String.valueOf(System.currentTimeMillis()));
            zzdsbVarZza.zzb("offline_ad", "1");
        }
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzhb)).booleanValue()) {
            boolean z2 = u3.c.y(zzfcfVar.zza.zza) != 1;
            zzdsbVarZza.zzb("scar", String.valueOf(z2));
            if (z2) {
                q3 q3Var = zzfcfVar.zza.zza.zzd;
                zzdsbVarZza.zzb("ragent", q3Var.I);
                zzdsbVarZza.zzb("rtype", u3.c.v(u3.c.w(q3Var)));
            }
        }
        return zzdsbVarZza;
    }

    private final void zzg(zzdsb zzdsbVar) {
        if (!this.zzg.zzb()) {
            zzdsbVar.zzj();
            return;
        }
        String strZze = zzdsbVar.zze();
        n.D.f11584k.getClass();
        this.zzh.zzd(new zzebu(System.currentTimeMillis(), this.zzf.zzb.zzb.zzb, strZze, 2));
    }

    private final boolean zzh() {
        int i10 = this.zzg.zzb;
        return i10 == 2 || i10 == 5 || i10 == 6 || i10 == 7;
    }

    private final boolean zzi() {
        String strG;
        if (this.zzk == null) {
            synchronized (this) {
                if (this.zzk == null) {
                    String str = (String) t.f12227d.f12230c.zzb(zzbdc.zzbD);
                    r0 r0Var = n.D.f11577c;
                    try {
                        strG = r0.G(this.zzc);
                    } catch (RemoteException unused) {
                        strG = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strG != null) {
                        try {
                            zMatches = Pattern.matches(str, strG);
                        } catch (RuntimeException e10) {
                            n.D.f11582h.zzw(e10, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzk = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.zzk.booleanValue();
    }

    @Override // nc.a
    public final void onAdClicked() {
        if (this.zzg.zzb()) {
            zzg(zzf("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zzc(h2 h2Var) {
        h2 h2Var2;
        if (this.zzl) {
            zzdsb zzdsbVarZzf = zzf("ifts");
            zzdsbVarZzf.zzb("reason", "adapter");
            int i10 = h2Var.f12114a;
            String str = h2Var.f12115b;
            if (h2Var.f12116c.equals("com.google.android.gms.ads") && (h2Var2 = h2Var.f12117d) != null && !h2Var2.f12116c.equals("com.google.android.gms.ads")) {
                h2 h2Var3 = h2Var.f12117d;
                i10 = h2Var3.f12114a;
                str = h2Var3.f12115b;
            }
            if (i10 >= 0) {
                zzdsbVarZzf.zzb("arec", String.valueOf(i10));
            }
            String strZza = this.zzd.zza(str);
            if (strZza != null) {
                zzdsbVarZzf.zzb("areec", strZza);
            }
            zzdsbVarZzf.zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zzd() {
        if (this.zzl) {
            zzdsb zzdsbVarZzf = zzf("ifts");
            zzdsbVarZzf.zzb("reason", "blocked");
            zzdsbVarZzf.zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdaq
    public final void zzdp() {
        if (zzi()) {
            zzf("adapter_shown").zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdaq
    public final void zzdq() {
        if (zzi()) {
            zzdsb zzdsbVarZzf = zzf("adapter_impression");
            zzdsbVarZzf.zzb("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzb.get()) {
                zzdsbVarZzf.zzb("po", "1");
                n.D.f11584k.getClass();
                zzdsbVarZzf.zzb("pil", String.valueOf(System.currentTimeMillis() - this.zzj));
            } else {
                zzdsbVarZzf.zzb("po", "0");
            }
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zznA)).booleanValue() && zzh()) {
                r0 r0Var = n.D.f11577c;
                zzdsbVarZzf.zzb("foreground", true != r0.f(this.zzc) ? "1" : "0");
                zzdsbVarZzf.zzb("fg_show", true == this.zza.get() ? "1" : "0");
            }
            zzdsbVarZzf.zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zze(zzdgf zzdgfVar) {
        if (this.zzl) {
            zzdsb zzdsbVarZzf = zzf("ifts");
            zzdsbVarZzf.zzb("reason", "exception");
            if (!TextUtils.isEmpty(zzdgfVar.getMessage())) {
                zzdsbVarZzf.zzb("msg", zzdgfVar.getMessage());
            }
            zzdsbVarZzf.zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzs() {
        if (zzi() || this.zzg.zzb()) {
            zzdsb zzdsbVarZzf = zzf("impression");
            zzdsbVarZzf.zzb("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzj > 0) {
                n.D.f11584k.getClass();
                zzdsbVarZzf.zzb("p_imp_l", String.valueOf(System.currentTimeMillis() - this.zzj));
            }
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zznA)).booleanValue() && zzh()) {
                r0 r0Var = n.D.f11577c;
                zzdsbVarZzf.zzb("foreground", true != r0.f(this.zzc) ? "1" : "0");
                zzdsbVarZzf.zzb("fg_show", true == this.zza.get() ? "1" : "0");
            }
            zzg(zzdsbVarZzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final void zzu() {
        if (zzi()) {
            this.zzb.set(true);
            n.D.f11584k.getClass();
            this.zzj = System.currentTimeMillis();
            zzdsb zzdsbVarZzf = zzf("presentation");
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zznA)).booleanValue() && zzh()) {
                AtomicBoolean atomicBoolean = this.zza;
                atomicBoolean.set(!r0.f(this.zzc));
                zzdsbVarZzf.zzb("foreground", true != atomicBoolean.get() ? "0" : "1");
            }
            zzdsbVarZzf.zzj();
        }
    }
}
