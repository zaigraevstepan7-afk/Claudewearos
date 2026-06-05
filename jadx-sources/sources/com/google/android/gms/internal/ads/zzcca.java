package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import mc.n;
import nc.s;
import nc.t;
import p1.l;
import qc.l0;
import qc.r0;
import qc.u;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcca {
    private static final boolean zza;
    private final Context zzb;
    private final String zzc;
    private final rc.a zzd;
    private final zzbdo zze;
    private final zzbdr zzf;
    private final u zzg;
    private final long[] zzh;
    private final String[] zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcbf zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;

    static {
        zza = s.f12202f.f12207e.nextInt(100) < ((Integer) t.f12227d.f12230c.zzb(zzbdc.zzmT)).intValue();
    }

    public zzcca(Context context, rc.a aVar, String str, zzbdr zzbdrVar, zzbdo zzbdoVar) {
        l lVar = new l(1);
        lVar.K("min_1", Double.MIN_VALUE, 1.0d);
        lVar.K("1_5", 1.0d, 5.0d);
        lVar.K("5_10", 5.0d, 10.0d);
        lVar.K("10_20", 10.0d, 20.0d);
        lVar.K("20_30", 20.0d, 30.0d);
        lVar.K("30_max", 30.0d, Double.MAX_VALUE);
        this.zzg = new u(lVar);
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzr = -1L;
        this.zzb = context;
        this.zzd = aVar;
        this.zzc = str;
        this.zzf = zzbdrVar;
        this.zze = zzbdoVar;
        String str2 = (String) t.f12227d.f12230c.zzb(zzbdc.zzQ);
        if (str2 == null) {
            this.zzi = new String[0];
            this.zzh = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, ",");
        int length = strArrSplit.length;
        this.zzi = new String[length];
        this.zzh = new long[length];
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            try {
                this.zzh[i10] = Long.parseLong(strArrSplit[i10]);
            } catch (NumberFormatException e10) {
                int i11 = l0.f13401b;
                k.h("Unable to parse frame hash target time number.", e10);
                this.zzh[i10] = -1;
            }
        }
    }

    public final void zza(zzcbf zzcbfVar) {
        zzbdr zzbdrVar = this.zzf;
        zzbdj.zza(zzbdrVar, this.zze, "vpc2");
        this.zzj = true;
        zzbdrVar.zzd("vpn", zzcbfVar.zzj());
        this.zzo = zzcbfVar;
    }

    public final void zzb() {
        if (!this.zzj || this.zzk) {
            return;
        }
        zzbdj.zza(this.zzf, this.zze, "vfr2");
        this.zzk = true;
    }

    public final void zzc() {
        this.zzn = true;
        if (!this.zzk || this.zzl) {
            return;
        }
        zzbdj.zza(this.zzf, this.zze, "vfp2");
        this.zzl = true;
    }

    public final void zzd() {
        Bundle bundleY;
        if (!zza || this.zzp) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.zzc);
        bundle.putString("player", this.zzo.zzj());
        u uVar = this.zzg;
        String[] strArr = uVar.f13461a;
        ArrayList arrayList = new ArrayList(strArr.length);
        int i10 = 0;
        while (i10 < strArr.length) {
            String str = strArr[i10];
            double[] dArr = uVar.f13463c;
            double[] dArr2 = uVar.f13462b;
            int[] iArr = uVar.f13464d;
            double d10 = dArr[i10];
            double d11 = dArr2[i10];
            int i11 = iArr[i10];
            arrayList.add(new qc.t(str, d10, d11, i11 / uVar.f13465e, i11));
            i10++;
            uVar = uVar;
            strArr = strArr;
        }
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            qc.t tVar = (qc.t) obj;
            String str2 = tVar.f13456a;
            bundle.putString("fps_c_".concat(String.valueOf(str2)), Integer.toString(tVar.f13460e));
            bundle.putString("fps_p_".concat(String.valueOf(str2)), Double.toString(tVar.f13459d));
        }
        int i13 = 0;
        while (true) {
            long[] jArr = this.zzh;
            if (i13 >= jArr.length) {
                break;
            }
            String str3 = this.zzi[i13];
            if (str3 != null) {
                bundle.putString("fh_".concat(Long.valueOf(jArr[i13]).toString()), str3);
            }
            i13++;
        }
        final Context context = this.zzb;
        rc.a aVar = this.zzd;
        final r0 r0Var = n.D.f11577c;
        String str4 = aVar.f14321a;
        AtomicReference atomicReference = r0Var.f13448c;
        bundle.putString("device", r0.I());
        zzbct zzbctVar = zzbdc.zza;
        t tVar2 = t.f12227d;
        bundle.putString("eids", TextUtils.join(",", tVar2.f12228a.zza()));
        int i14 = 1;
        if (bundle.isEmpty()) {
            int i15 = l0.f13401b;
            k.b("Empty or null bundle.");
        } else {
            final String str5 = (String) tVar2.f12230c.zzb(zzbdc.zzkN);
            if (!r0Var.f13449d.getAndSet(true)) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: qc.p0
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str6) {
                        r0Var.f13448c.set(cg.b.Y(context, str5));
                    }
                };
                if (TextUtils.isEmpty(str5)) {
                    bundleY = Bundle.EMPTY;
                } else {
                    PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    bundleY = cg.b.Y(context, str5);
                }
                atomicReference.set(bundleY);
            }
            bundle.putAll((Bundle) atomicReference.get());
        }
        rc.e eVar = s.f12202f.f12203a;
        rc.e.a(context, str4, bundle, new q5.b(i14, context, str4));
        this.zzp = true;
    }

    public final void zze() {
        this.zzn = false;
    }

    public final void zzf(zzcbf zzcbfVar) {
        if (this.zzl && !this.zzm) {
            if (l0.m() && !this.zzm) {
                l0.k("VideoMetricsMixin first frame");
            }
            zzbdj.zza(this.zzf, this.zze, "vff2");
            this.zzm = true;
        }
        n.D.f11584k.getClass();
        long jNanoTime = System.nanoTime();
        if (this.zzn && this.zzq && this.zzr != -1) {
            double nanos = TimeUnit.SECONDS.toNanos(1L);
            long j = jNanoTime - this.zzr;
            u uVar = this.zzg;
            double d10 = nanos / j;
            uVar.f13465e++;
            int i10 = 0;
            while (true) {
                double[] dArr = uVar.f13463c;
                if (i10 >= dArr.length) {
                    break;
                }
                double d11 = dArr[i10];
                if (d11 <= d10 && d10 < uVar.f13462b[i10]) {
                    int[] iArr = uVar.f13464d;
                    iArr[i10] = iArr[i10] + 1;
                }
                if (d10 < d11) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.zzq = this.zzn;
        this.zzr = jNanoTime;
        long jLongValue = ((Long) t.f12227d.f12230c.zzb(zzbdc.zzR)).longValue();
        long jZza = zzcbfVar.zza();
        int i11 = 0;
        while (true) {
            String[] strArr = this.zzi;
            if (i11 >= strArr.length) {
                return;
            }
            if (strArr[i11] == null && jLongValue > Math.abs(jZza - this.zzh[i11])) {
                int i12 = 8;
                Bitmap bitmap = zzcbfVar.getBitmap(8, 8);
                long j4 = 63;
                int i13 = 0;
                long j10 = 0;
                while (i13 < i12) {
                    int i14 = 0;
                    while (i14 < i12) {
                        int pixel = bitmap.getPixel(i14, i13);
                        j10 |= (Color.green(pixel) + (Color.red(pixel) + Color.blue(pixel)) > 128 ? 1L : 0L) << ((int) j4);
                        j4--;
                        i14++;
                        i12 = 8;
                    }
                    i13++;
                    i12 = 8;
                }
                strArr[i11] = String.format("%016X", Long.valueOf(j10));
                return;
            }
            i11++;
        }
    }
}
