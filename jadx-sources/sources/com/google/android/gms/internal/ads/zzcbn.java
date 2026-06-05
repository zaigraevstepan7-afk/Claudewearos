package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.anonlab.voidlauncher.R;
import com.google.android.gms.common.internal.e0;
import java.util.HashMap;
import mc.n;
import nc.t;
import qc.l0;
import qc.r0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcbn extends FrameLayout implements zzcbe {
    final zzccb zza;
    private final zzcbz zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbdr zze;
    private final long zzf;
    private final zzcbf zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzcbn(Context context, zzcbz zzcbzVar, int i10, boolean z2, zzbdr zzbdrVar, zzcby zzcbyVar, zzdsc zzdscVar) {
        zzcbf zzcbdVar;
        zzbdr zzbdrVar2;
        zzcbf zzcetVar;
        super(context);
        this.zzb = zzcbzVar;
        this.zze = zzbdrVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        e0.i(zzcbzVar.zzj());
        zzcbr zzcbrVar = zzcbzVar.zzj().f11534a;
        zzcca zzccaVar = new zzcca(context, zzcbzVar.zzm(), zzcbzVar.zzs(), zzbdrVar, zzcbzVar.zzk());
        if (i10 == 3) {
            zzcetVar = new zzcet(context, zzccaVar);
            zzbdrVar2 = zzbdrVar;
        } else {
            if (i10 == 2) {
                zzcbdVar = new zzccr(context, zzccaVar, zzcbzVar, z2, zzcbg.zza(zzcbzVar), zzcbyVar, zzdscVar);
                zzbdrVar2 = zzbdrVar;
            } else {
                zzbdrVar2 = zzbdrVar;
                zzcbdVar = new zzcbd(context, zzcbzVar, z2, zzcbg.zza(zzcbzVar), zzcbyVar, new zzcca(context, zzcbzVar.zzm(), zzcbzVar.zzs(), zzbdrVar, zzcbzVar.zzk()), zzdscVar);
            }
            zzcetVar = zzcbdVar;
        }
        this.zzg = zzcetVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcetVar, new FrameLayout.LayoutParams(-1, -1, 17));
        zzbct zzbctVar = zzbdc.zzV;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) tVar.f12230c.zzb(zzbdc.zzS)).booleanValue()) {
            zzp();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) tVar.f12230c.zzb(zzbdc.zzX)).longValue();
        boolean zBooleanValue = ((Boolean) tVar.f12230c.zzb(zzbdc.zzU)).booleanValue();
        this.zzk = zBooleanValue;
        if (zzbdrVar2 != null) {
            zzbdrVar2.zzd("spinner_used", true != zBooleanValue ? "0" : "1");
        }
        this.zza = new zzccb(this);
        zzcetVar.zzr(this);
    }

    private final void zzJ() {
        zzcbz zzcbzVar = this.zzb;
        if (zzcbzVar.zzi() == null || !this.zzi || this.zzj) {
            return;
        }
        zzcbzVar.zzi().getWindow().clearFlags(128);
        this.zzi = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzK(String str, String... strArr) {
        HashMap map = new HashMap();
        Integer numZzl = zzl();
        if (numZzl != null) {
            map.put("playerId", numZzl.toString());
        }
        map.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zzd("onVideoEvent", map);
    }

    private final boolean zzL() {
        return this.zzq.getParent() != null;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            final zzcbf zzcbfVar = this.zzg;
            if (zzcbfVar != null) {
                zzcad.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbh
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcbfVar.zzt();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        r0.f13445l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbj
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzK("windowFocusChanged", "hasWindowFocus", String.valueOf(z2));
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcbe
    public final void onWindowVisibilityChanged(int i10) {
        boolean z2;
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            this.zza.zzb();
            z2 = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z2 = false;
        }
        r0.f13445l.post(new zzcbm(this, z2));
    }

    public final void zzA(int i10) {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null) {
            return;
        }
        zzcbfVar.zzz(i10);
    }

    public final void zzB(int i10) {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null) {
            return;
        }
        zzcbfVar.zzA(i10);
    }

    public final void zzC(int i10) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzV)).booleanValue()) {
            this.zzc.setBackgroundColor(i10);
            this.zzd.setBackgroundColor(i10);
        }
    }

    public final void zzD(int i10) {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null) {
            return;
        }
        zzcbfVar.zzB(i10);
    }

    public final void zzE(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzF(int i10, int i11, int i12, int i13) {
        if (l0.m()) {
            StringBuilder sbQ = gk.b.q("Set video bounds to x:", i10, ";y:", i11, ";w:");
            sbQ.append(i12);
            sbQ.append(";h:");
            sbQ.append(i13);
            l0.k(sbQ.toString());
        }
        if (i12 == 0 || i13 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
        layoutParams.setMargins(i10, i11, 0, 0);
        this.zzc.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzG(float f10) {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null) {
            return;
        }
        zzcbfVar.zzb.zze(f10);
        zzcbfVar.zzn();
    }

    public final void zzH(float f10, float f11) {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar != null) {
            zzcbfVar.zzu(f10, f11);
        }
    }

    public final void zzI() {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null) {
            return;
        }
        zzcbfVar.zzb.zzd(false);
        zzcbfVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zza() {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcc)).booleanValue()) {
            this.zza.zza();
        }
        zzK("ended", new String[0]);
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzb(String str, String str2) {
        zzK("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzc(String str, String str2) {
        zzK("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzd() {
        zzK("pause", new String[0]);
        zzJ();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zze() {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcc)).booleanValue()) {
            this.zza.zzb();
        }
        zzcbz zzcbzVar = this.zzb;
        if (zzcbzVar.zzi() != null && !this.zzi) {
            boolean z2 = (zzcbzVar.zzi().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z2;
            if (!z2) {
                zzcbzVar.zzi().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzf() {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar != null && this.zzm == 0) {
            zzK("canplaythrough", "duration", String.valueOf(zzcbfVar.zzc() / 1000.0f), "videoWidth", String.valueOf(zzcbfVar.zze()), "videoHeight", String.valueOf(zzcbfVar.zzd()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzg() {
        this.zzd.setVisibility(4);
        r0.f13445l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbi
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzK("firstFrameRendered", new String[0]);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzh() {
        this.zza.zzb();
        r0.f13445l.post(new zzcbk(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzi() {
        if (this.zzr && this.zzp != null && !zzL()) {
            ImageView imageView = this.zzq;
            imageView.setImageBitmap(this.zzp);
            imageView.invalidate();
            FrameLayout frameLayout = this.zzc;
            frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(imageView);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        r0.f13445l.post(new zzcbl(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzj(int i10, int i11) {
        if (this.zzk) {
            zzbct zzbctVar = zzbdc.zzW;
            t tVar = t.f12227d;
            int iMax = Math.max(i10 / ((Integer) tVar.f12230c.zzb(zzbctVar)).intValue(), 1);
            int iMax2 = Math.max(i11 / ((Integer) tVar.f12230c.zzb(zzbctVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == iMax && this.zzp.getHeight() == iMax2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzk() {
        if (this.zzh && zzL()) {
            this.zzc.removeView(this.zzq);
        }
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null || this.zzp == null) {
            return;
        }
        n nVar = n.D;
        nVar.f11584k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzcbfVar.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        nVar.f11584k.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        if (l0.m()) {
            l0.k("Spinner frame grab took " + jElapsedRealtime2 + "ms");
        }
        if (jElapsedRealtime2 > this.zzf) {
            k.g("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbdr zzbdrVar = this.zze;
            if (zzbdrVar != null) {
                zzbdrVar.zzd("spinner_jank", Long.toString(jElapsedRealtime2));
            }
        }
    }

    public final Integer zzl() {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar != null) {
            return zzcbfVar.zzw();
        }
        return null;
    }

    public final void zzp() {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null) {
            return;
        }
        TextView textView = new TextView(zzcbfVar.getContext());
        Resources resourcesZze = n.D.f11582h.zze();
        textView.setText(String.valueOf(resourcesZze == null ? "AdMob - " : resourcesZze.getString(R.string.watermark_label_prefix)).concat(zzcbfVar.zzj()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout frameLayout = this.zzc;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.bringChildToFront(textView);
    }

    public final void zzq() {
        this.zza.zza();
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar != null) {
            zzcbfVar.zzt();
        }
        zzJ();
    }

    public final void zzr(Integer num) {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null) {
            return;
        }
        if (TextUtils.isEmpty(this.zzn)) {
            zzK("no_src", new String[0]);
        } else {
            zzcbfVar.zzC(this.zzn, this.zzo, num);
        }
    }

    public final void zzs() {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null) {
            return;
        }
        zzcbfVar.zzb.zzd(true);
        zzcbfVar.zzn();
    }

    public final void zzt() {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null) {
            return;
        }
        long jZza = zzcbfVar.zza();
        if (this.zzl == jZza || jZza <= 0) {
            return;
        }
        float f10 = jZza / 1000.0f;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzca)).booleanValue()) {
            String strValueOf = String.valueOf(f10);
            String strValueOf2 = String.valueOf(zzcbfVar.zzh());
            String strValueOf3 = String.valueOf(zzcbfVar.zzf());
            String strValueOf4 = String.valueOf(zzcbfVar.zzg());
            String strValueOf5 = String.valueOf(zzcbfVar.zzb());
            n.D.f11584k.getClass();
            zzK("timeupdate", "time", strValueOf, "totalBytes", strValueOf2, "qoeCachedBytes", strValueOf3, "qoeLoadedBytes", strValueOf4, "droppedFrames", strValueOf5, "reportTime", String.valueOf(System.currentTimeMillis()));
        } else {
            zzK("timeupdate", "time", String.valueOf(f10));
        }
        this.zzl = jZza;
    }

    public final void zzu() {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null) {
            return;
        }
        zzcbfVar.zzo();
    }

    public final void zzv() {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null) {
            return;
        }
        zzcbfVar.zzp();
    }

    public final void zzw(int i10) {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null) {
            return;
        }
        zzcbfVar.zzq(i10);
    }

    public final void zzx(MotionEvent motionEvent) {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null) {
            return;
        }
        zzcbfVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzy(int i10) {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null) {
            return;
        }
        zzcbfVar.zzx(i10);
    }

    public final void zzz(int i10) {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null) {
            return;
        }
        zzcbfVar.zzy(i10);
    }
}
