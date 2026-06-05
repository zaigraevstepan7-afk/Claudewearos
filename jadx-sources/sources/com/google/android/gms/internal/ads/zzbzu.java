package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import mc.n;
import nc.q3;
import nc.t;
import qc.n0;
import qc.o0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbzu implements zzazu {
    final zzbzr zza;
    private final n0 zze;
    private final Object zzd = new Object();
    final HashSet zzb = new HashSet();
    final HashSet zzc = new HashSet();
    private boolean zzg = false;
    private final zzbzs zzf = new zzbzs();

    public zzbzu(String str, n0 n0Var) {
        this.zza = new zzbzr(str, n0Var);
        this.zze = n0Var;
    }

    @Override // com.google.android.gms.internal.ads.zzazu
    public final void zza(boolean z2) {
        long j;
        int i10;
        n.D.f11584k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z2) {
            o0 o0Var = (o0) this.zze;
            o0Var.l();
            synchronized (o0Var.f13414a) {
                j = o0Var.f13427o;
            }
            if (jCurrentTimeMillis - j > ((Long) t.f12227d.f12230c.zzb(zzbdc.zzbf)).longValue()) {
                this.zza.zzd = -1;
            } else {
                zzbzr zzbzrVar = this.zza;
                o0Var.l();
                synchronized (o0Var.f13414a) {
                    i10 = o0Var.f13429q;
                }
                zzbzrVar.zzd = i10;
            }
            this.zzg = true;
            return;
        }
        o0 o0Var2 = (o0) this.zze;
        o0Var2.l();
        synchronized (o0Var2.f13414a) {
            try {
                if (o0Var2.f13427o != jCurrentTimeMillis) {
                    o0Var2.f13427o = jCurrentTimeMillis;
                    SharedPreferences.Editor editor = o0Var2.f13420g;
                    if (editor != null) {
                        editor.putLong("app_last_background_time_ms", jCurrentTimeMillis);
                        o0Var2.f13420g.apply();
                    }
                    o0Var2.m();
                }
            } finally {
            }
        }
        int i11 = this.zza.zzd;
        o0Var2.l();
        synchronized (o0Var2.f13414a) {
            try {
                if (o0Var2.f13429q == i11) {
                    return;
                }
                o0Var2.f13429q = i11;
                SharedPreferences.Editor editor2 = o0Var2.f13420g;
                if (editor2 != null) {
                    editor2.putInt("request_in_session_count", i11);
                    o0Var2.f13420g.apply();
                }
                o0Var2.m();
            } finally {
            }
        }
    }

    public final int zzb() {
        int iZza;
        synchronized (this.zzd) {
            iZza = this.zza.zza();
        }
        return iZza;
    }

    public final zzbzj zzc(ud.a aVar, String str) {
        return new zzbzj(aVar, this, this.zzf.zza(), str);
    }

    public final String zzd() {
        return this.zzf.zzb();
    }

    public final void zze(zzbzj zzbzjVar) {
        synchronized (this.zzd) {
            this.zzb.add(zzbzjVar);
        }
    }

    public final void zzf() {
        synchronized (this.zzd) {
            this.zza.zzc();
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            this.zza.zzd();
        }
    }

    public final void zzh() {
        synchronized (this.zzd) {
            this.zza.zze();
        }
    }

    public final void zzi() {
        synchronized (this.zzd) {
            this.zza.zzf();
        }
    }

    public final void zzj(q3 q3Var, long j) {
        synchronized (this.zzd) {
            this.zza.zzg(q3Var, j);
        }
    }

    public final void zzk() {
        synchronized (this.zzd) {
            this.zza.zzh();
        }
    }

    public final void zzl(HashSet hashSet) {
        synchronized (this.zzd) {
            this.zzb.addAll(hashSet);
        }
    }

    public final boolean zzm() {
        return this.zzg;
    }

    public final Bundle zzn(Context context, zzfdv zzfdvVar) {
        HashSet hashSet = new HashSet();
        synchronized (this.zzd) {
            HashSet hashSet2 = this.zzb;
            hashSet.addAll(hashSet2);
            hashSet2.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.zza.zzb(context, this.zzf.zzb()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.zzc.iterator();
        if (it.hasNext()) {
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((zzbzj) it2.next()).zza());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        zzfdvVar.zzc(hashSet);
        return bundle;
    }
}
