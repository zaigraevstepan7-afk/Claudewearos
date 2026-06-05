package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import java.util.Collections;
import nc.t;
import org.json.JSONException;
import q.f;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbsm extends zzbss {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzcfe zzj;
    private final Activity zzk;
    private zzcgy zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbst zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        f fVar = new f(7);
        Collections.addAll(fVar, "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
        Collections.unmodifiableSet(fVar);
    }

    public zzbsm(zzcfe zzcfeVar, zzbst zzbstVar) {
        super(zzcfeVar, "resize");
        this.zza = "top-right";
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzcfeVar;
        this.zzk = zzcfeVar.zzi();
        this.zzo = zzbstVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzm(boolean z2) throws JSONException {
        zzbct zzbctVar = zzbdc.zzlc;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            this.zzq.removeView((View) this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView((View) this.zzj);
        }
        if (((Boolean) tVar.f12230c.zzb(zzbdc.zzld)).booleanValue()) {
            View view = (View) this.zzj;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((Boolean) tVar.f12230c.zzb(zzbdc.zzle)).booleanValue()) {
                try {
                    ViewGroup viewGroup2 = this.zzr;
                    zzcfe zzcfeVar = this.zzj;
                    viewGroup2.addView((View) zzcfeVar);
                    zzcfeVar.zzaj(this.zzl);
                } catch (IllegalStateException e10) {
                    int i10 = l0.f13401b;
                    k.e("Unable to add webview back to view hierarchy.", e10);
                }
            } else {
                ViewGroup viewGroup3 = this.zzr;
                zzcfe zzcfeVar2 = this.zzj;
                viewGroup3.addView((View) zzcfeVar2);
                zzcfeVar2.zzaj(this.zzl);
            }
        }
        if (z2) {
            zzl("default");
            zzbst zzbstVar = this.zzo;
            if (zzbstVar != null) {
                zzbstVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    public final void zzb(final boolean z2) {
        synchronized (this.zzi) {
            try {
                if (this.zzp != null) {
                    if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzlb)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        zzm(z2);
                    } else {
                        zzcad.zzf.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsk
                            @Override // java.lang.Runnable
                            public final void run() throws JSONException {
                                this.zza.zzm(z2);
                            }
                        });
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0268 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:11:0x0017, B:13:0x001f, B:14:0x0024, B:16:0x0026, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003d, B:24:0x0042, B:26:0x0044, B:28:0x0052, B:29:0x0064, B:31:0x0072, B:32:0x0084, B:34:0x0092, B:35:0x00a4, B:37:0x00b2, B:38:0x00c4, B:40:0x00d2, B:41:0x00e0, B:43:0x00ee, B:44:0x00f0, B:46:0x00f4, B:48:0x00f8, B:50:0x00fe, B:53:0x0106, B:57:0x0138, B:63:0x0144, B:121:0x0268, B:122:0x026d, B:124:0x026f, B:126:0x0296, B:128:0x029a, B:130:0x02a6, B:132:0x02da, B:138:0x0353, B:161:0x03aa, B:162:0x03c2, B:163:0x03e9, B:165:0x03f1, B:166:0x03f8, B:167:0x041c, B:170:0x041f, B:172:0x0440, B:173:0x0452, B:142:0x0362, B:146:0x0371, B:150:0x0380, B:154:0x038f, B:159:0x03a0, B:160:0x03a4, B:131:0x02d7, B:175:0x0454, B:176:0x0459, B:65:0x014e, B:67:0x0152, B:72:0x0165, B:97:0x01ee, B:99:0x01f1, B:101:0x01f5, B:104:0x01fc, B:76:0x017d, B:77:0x0188, B:81:0x0197, B:85:0x01aa, B:89:0x01ba, B:90:0x01c1, B:94:0x01cd, B:95:0x01e1, B:105:0x020b, B:111:0x023f, B:117:0x024f, B:114:0x0245, B:116:0x024d, B:108:0x0237, B:110:0x023d, B:118:0x0254, B:119:0x025d, B:178:0x045b, B:179:0x0460, B:181:0x0462, B:182:0x0467), top: B:186:0x0009, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x026f A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:11:0x0017, B:13:0x001f, B:14:0x0024, B:16:0x0026, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003d, B:24:0x0042, B:26:0x0044, B:28:0x0052, B:29:0x0064, B:31:0x0072, B:32:0x0084, B:34:0x0092, B:35:0x00a4, B:37:0x00b2, B:38:0x00c4, B:40:0x00d2, B:41:0x00e0, B:43:0x00ee, B:44:0x00f0, B:46:0x00f4, B:48:0x00f8, B:50:0x00fe, B:53:0x0106, B:57:0x0138, B:63:0x0144, B:121:0x0268, B:122:0x026d, B:124:0x026f, B:126:0x0296, B:128:0x029a, B:130:0x02a6, B:132:0x02da, B:138:0x0353, B:161:0x03aa, B:162:0x03c2, B:163:0x03e9, B:165:0x03f1, B:166:0x03f8, B:167:0x041c, B:170:0x041f, B:172:0x0440, B:173:0x0452, B:142:0x0362, B:146:0x0371, B:150:0x0380, B:154:0x038f, B:159:0x03a0, B:160:0x03a4, B:131:0x02d7, B:175:0x0454, B:176:0x0459, B:65:0x014e, B:67:0x0152, B:72:0x0165, B:97:0x01ee, B:99:0x01f1, B:101:0x01f5, B:104:0x01fc, B:76:0x017d, B:77:0x0188, B:81:0x0197, B:85:0x01aa, B:89:0x01ba, B:90:0x01c1, B:94:0x01cd, B:95:0x01e1, B:105:0x020b, B:111:0x023f, B:117:0x024f, B:114:0x0245, B:116:0x024d, B:108:0x0237, B:110:0x023d, B:118:0x0254, B:119:0x025d, B:178:0x045b, B:179:0x0460, B:181:0x0462, B:182:0x0467), top: B:186:0x0009, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03a4 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:11:0x0017, B:13:0x001f, B:14:0x0024, B:16:0x0026, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003d, B:24:0x0042, B:26:0x0044, B:28:0x0052, B:29:0x0064, B:31:0x0072, B:32:0x0084, B:34:0x0092, B:35:0x00a4, B:37:0x00b2, B:38:0x00c4, B:40:0x00d2, B:41:0x00e0, B:43:0x00ee, B:44:0x00f0, B:46:0x00f4, B:48:0x00f8, B:50:0x00fe, B:53:0x0106, B:57:0x0138, B:63:0x0144, B:121:0x0268, B:122:0x026d, B:124:0x026f, B:126:0x0296, B:128:0x029a, B:130:0x02a6, B:132:0x02da, B:138:0x0353, B:161:0x03aa, B:162:0x03c2, B:163:0x03e9, B:165:0x03f1, B:166:0x03f8, B:167:0x041c, B:170:0x041f, B:172:0x0440, B:173:0x0452, B:142:0x0362, B:146:0x0371, B:150:0x0380, B:154:0x038f, B:159:0x03a0, B:160:0x03a4, B:131:0x02d7, B:175:0x0454, B:176:0x0459, B:65:0x014e, B:67:0x0152, B:72:0x0165, B:97:0x01ee, B:99:0x01f1, B:101:0x01f5, B:104:0x01fc, B:76:0x017d, B:77:0x0188, B:81:0x0197, B:85:0x01aa, B:89:0x01ba, B:90:0x01c1, B:94:0x01cd, B:95:0x01e1, B:105:0x020b, B:111:0x023f, B:117:0x024f, B:114:0x0245, B:116:0x024d, B:108:0x0237, B:110:0x023d, B:118:0x0254, B:119:0x025d, B:178:0x045b, B:179:0x0460, B:181:0x0462, B:182:0x0467), top: B:186:0x0009, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e1 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:11:0x0017, B:13:0x001f, B:14:0x0024, B:16:0x0026, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003d, B:24:0x0042, B:26:0x0044, B:28:0x0052, B:29:0x0064, B:31:0x0072, B:32:0x0084, B:34:0x0092, B:35:0x00a4, B:37:0x00b2, B:38:0x00c4, B:40:0x00d2, B:41:0x00e0, B:43:0x00ee, B:44:0x00f0, B:46:0x00f4, B:48:0x00f8, B:50:0x00fe, B:53:0x0106, B:57:0x0138, B:63:0x0144, B:121:0x0268, B:122:0x026d, B:124:0x026f, B:126:0x0296, B:128:0x029a, B:130:0x02a6, B:132:0x02da, B:138:0x0353, B:161:0x03aa, B:162:0x03c2, B:163:0x03e9, B:165:0x03f1, B:166:0x03f8, B:167:0x041c, B:170:0x041f, B:172:0x0440, B:173:0x0452, B:142:0x0362, B:146:0x0371, B:150:0x0380, B:154:0x038f, B:159:0x03a0, B:160:0x03a4, B:131:0x02d7, B:175:0x0454, B:176:0x0459, B:65:0x014e, B:67:0x0152, B:72:0x0165, B:97:0x01ee, B:99:0x01f1, B:101:0x01f5, B:104:0x01fc, B:76:0x017d, B:77:0x0188, B:81:0x0197, B:85:0x01aa, B:89:0x01ba, B:90:0x01c1, B:94:0x01cd, B:95:0x01e1, B:105:0x020b, B:111:0x023f, B:117:0x024f, B:114:0x0245, B:116:0x024d, B:108:0x0237, B:110:0x023d, B:118:0x0254, B:119:0x025d, B:178:0x045b, B:179:0x0460, B:181:0x0462, B:182:0x0467), top: B:186:0x0009, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzc(java.util.Map r18) {
        /*
            Method dump skipped, instructions count: 1184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsm.zzc(java.util.Map):void");
    }

    public final void zzd(int i10, int i11, boolean z2) {
        synchronized (this.zzi) {
            this.zzc = i10;
            this.zzd = i11;
        }
    }

    public final void zze(int i10, int i11) {
        this.zzc = i10;
        this.zzd = i11;
    }

    public final boolean zzf() {
        boolean z2;
        synchronized (this.zzi) {
            z2 = this.zzp != null;
        }
        return z2;
    }
}
