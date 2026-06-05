package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import nc.t;
import qc.l0;
import qc.x;
import qc.y;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdlb {
    private final y zza;
    private final ud.a zzb;
    private final Executor zzc;

    public zzdlb(y yVar, ud.a aVar, Executor executor) {
        this.zza = yVar;
        this.zzb = aVar;
        this.zzc = executor;
    }

    public static Bitmap zza(zzdlb zzdlbVar, double d10, boolean z2, zzapx zzapxVar) {
        byte[] bArr = zzapxVar.zzb;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d10 * 160.0d);
        if (!z2) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        zzbct zzbctVar = zzbdc.zzgn;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzdlbVar.zzc(bArr, options);
            options.inJustDecodeBounds = false;
            int i10 = options.outWidth * options.outHeight;
            if (i10 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i10 - 1) / ((Integer) tVar.f12230c.zzb(zzbdc.zzgo)).intValue())) / 2);
            }
        }
        return zzdlbVar.zzc(bArr, options);
    }

    private final Bitmap zzc(byte[] bArr, BitmapFactory.Options options) {
        ((ud.b) this.zzb).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        if (bitmapDecodeByteArray != null) {
            long j = jElapsedRealtime2 - jElapsedRealtime;
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            int allocationByteCount = bitmapDecodeByteArray.getAllocationByteCount();
            boolean z2 = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sbQ = gk.b.q("Decoded image w: ", width, " h:", height, " bytes: ");
            sbQ.append(allocationByteCount);
            sbQ.append(" time: ");
            sbQ.append(j);
            sbQ.append(" on ui thread: ");
            sbQ.append(z2);
            l0.k(sbQ.toString());
        }
        return bitmapDecodeByteArray;
    }

    public final mf.a zzb(String str, final double d10, final boolean z2) {
        this.zza.getClass();
        zzcai zzcaiVar = new zzcai();
        y.f13472a.zza(new x(str, zzcaiVar));
        return zzgdb.zzm(zzcaiVar, new zzfut() { // from class: com.google.android.gms.internal.ads.zzdla
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                return zzdlb.zza(this.zza, d10, z2, (zzapx) obj);
            }
        }, this.zzc);
    }
}
