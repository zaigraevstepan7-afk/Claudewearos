package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import nc.t;
import qc.l0;
import rc.k;
import rc.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class zzdsl {
    protected final Map zza;
    protected final Context zzb;
    protected final Executor zzc;
    protected final o zzd;
    protected final boolean zze;
    private final yc.c zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final AtomicBoolean zzi;
    private final AtomicReference zzj;

    public zzdsl(Executor executor, o oVar, yc.c cVar, Context context) {
        this.zza = new HashMap();
        this.zzi = new AtomicBoolean();
        this.zzj = new AtomicReference(new Bundle());
        this.zzc = executor;
        this.zzd = oVar;
        zzbct zzbctVar = zzbdc.zzch;
        t tVar = t.f12227d;
        this.zze = ((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue();
        this.zzf = cVar;
        this.zzg = ((Boolean) tVar.f12230c.zzb(zzbdc.zzcm)).booleanValue();
        this.zzh = ((Boolean) tVar.f12230c.zzb(zzbdc.zzhc)).booleanValue();
        this.zzb = context;
    }

    private final void zza(Map map) {
        Bundle bundleY;
        if (map == null || map.isEmpty()) {
            int i10 = l0.f13401b;
            k.b("Empty or null paramMap.");
            return;
        }
        if (!this.zzi.getAndSet(true)) {
            final String str = (String) t.f12227d.f12230c.zzb(zzbdc.zzkM);
            Context context = this.zzb;
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.ads.zzdsj
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                    zzdsl zzdslVar = this.zza;
                    zzdslVar.zzj.set(cg.b.Y(zzdslVar.zzb, str));
                }
            };
            if (TextUtils.isEmpty(str)) {
                bundleY = Bundle.EMPTY;
            } else {
                PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                bundleY = cg.b.Y(context, str);
            }
            this.zzj.set(bundleY);
        }
        Bundle bundle = (Bundle) this.zzj.get();
        for (String str2 : bundle.keySet()) {
            map.put(str2, String.valueOf(bundle.get(str2)));
        }
    }

    private final void zzh(Map map, boolean z2) {
        if (map.isEmpty()) {
            int i10 = l0.f13401b;
            k.b("Empty paramMap.");
            return;
        }
        zza(map);
        final String strA = this.zzf.a(map);
        l0.k(strA);
        boolean z10 = Boolean.parseBoolean((String) map.get("scar"));
        if (this.zze) {
            if (!z2 || this.zzg) {
                if (!z10 || this.zzh) {
                    this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsi
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzd.zza(strA);
                        }
                    });
                }
            }
        }
    }

    public final String zzb(Map map) {
        return this.zzf.a(map);
    }

    public final ConcurrentHashMap zzc() {
        return new ConcurrentHashMap(this.zza);
    }

    public final void zze(Map map) {
        if (map.isEmpty()) {
            int i10 = l0.f13401b;
            k.b("Empty paramMap.");
            return;
        }
        zza(map);
        final String strA = this.zzf.a(map);
        l0.k(strA);
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zznp)).booleanValue() || this.zze) {
            this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsk
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd.zza(strA);
                }
            });
        }
    }

    public final void zzf(Map map) {
        zzh(map, true);
    }

    public final void zzg(Map map) {
        zzh(map, false);
    }
}
