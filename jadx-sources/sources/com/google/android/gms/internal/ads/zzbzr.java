package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import mc.n;
import nc.q3;
import nc.t;
import qc.l0;
import qc.n0;
import qc.o0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbzr {
    final String zzf;
    private final n0 zzk;
    long zza = -1;
    long zzb = -1;
    int zzc = -1;
    int zzd = -1;
    long zze = 0;
    private final Object zzj = new Object();
    int zzg = 0;
    int zzh = 0;
    int zzi = 0;

    public zzbzr(String str, n0 n0Var) {
        this.zzf = str;
        this.zzk = n0Var;
    }

    private final void zzi() {
        if (((Boolean) zzbfj.zza.zze()).booleanValue()) {
            synchronized (this.zzj) {
                this.zzc--;
                this.zzd--;
            }
        }
    }

    public final int zza() {
        int i10;
        synchronized (this.zzj) {
            i10 = this.zzi;
        }
        return i10;
    }

    public final Bundle zzb(Context context, String str) {
        Bundle bundle;
        synchronized (this.zzj) {
            try {
                bundle = new Bundle();
                if (!((o0) this.zzk).k()) {
                    bundle.putString("session_id", this.zzf);
                }
                bundle.putLong("basets", this.zzb);
                bundle.putLong("currts", this.zza);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", this.zzc);
                bundle.putInt("preqs_in_session", this.zzd);
                bundle.putLong("time_in_session", this.zze);
                bundle.putInt("pclick", this.zzg);
                bundle.putInt("pimp", this.zzh);
                Context contextZza = zzbvy.zza(context);
                int identifier = contextZza.getResources().getIdentifier("Theme.Translucent", "style", "android");
                boolean z2 = false;
                if (identifier == 0) {
                    int i10 = l0.f13401b;
                    k.f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == contextZza.getPackageManager().getActivityInfo(new ComponentName(contextZza.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                            z2 = true;
                        } else {
                            int i11 = l0.f13401b;
                            k.f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        int i12 = l0.f13401b;
                        k.g("Fail to fetch AdActivity theme");
                        k.f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                bundle.putBoolean("support_transparent_background", z2);
                bundle.putInt("consent_form_action_identifier", zza());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bundle;
    }

    public final void zzc() {
        synchronized (this.zzj) {
            this.zzg++;
        }
    }

    public final void zzd() {
        synchronized (this.zzj) {
            this.zzh++;
        }
    }

    public final void zze() {
        zzi();
    }

    public final void zzf() {
        zzi();
    }

    public final void zzg(q3 q3Var, long j) {
        long j4;
        long j10;
        Bundle bundle;
        int i10;
        synchronized (this.zzj) {
            try {
                o0 o0Var = (o0) this.zzk;
                o0Var.l();
                synchronized (o0Var.f13414a) {
                    j4 = o0Var.f13427o;
                }
                n.D.f11584k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.zzb == -1) {
                    if (jCurrentTimeMillis - j4 > ((Long) t.f12227d.f12230c.zzb(zzbdc.zzbf)).longValue()) {
                        this.zzd = -1;
                    } else {
                        o0Var.l();
                        synchronized (o0Var.f13414a) {
                            i10 = o0Var.f13429q;
                        }
                        this.zzd = i10;
                    }
                    this.zzb = j;
                    this.zza = j;
                } else {
                    this.zza = j;
                }
                if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzdQ)).booleanValue() || (bundle = q3Var.f12192c) == null || bundle.getInt("gw", 2) != 1) {
                    this.zzc++;
                    int i11 = this.zzd + 1;
                    this.zzd = i11;
                    if (i11 == 0) {
                        this.zze = 0L;
                        o0Var.t(jCurrentTimeMillis);
                    } else {
                        o0Var.l();
                        synchronized (o0Var.f13414a) {
                            j10 = o0Var.f13428p;
                        }
                        this.zze = jCurrentTimeMillis - j10;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzh() {
        synchronized (this.zzj) {
            this.zzi++;
        }
    }
}
