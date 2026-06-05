package xc;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzavs;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbda;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbeh;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbfh;
import com.google.android.gms.internal.ads.zzbud;
import com.google.android.gms.internal.ads.zzbug;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcgz;
import com.google.android.gms.internal.ads.zzdnr;
import com.google.android.gms.internal.ads.zzdsh;
import com.google.android.gms.internal.ads.zzfcs;
import com.google.android.gms.internal.ads.zzfdn;
import com.google.android.gms.internal.ads.zzfhm;
import com.google.android.gms.internal.ads.zzfhp;
import com.google.android.gms.internal.ads.zzfjq;
import com.google.android.gms.internal.ads.zzfut;
import com.google.android.gms.internal.ads.zzfvv;
import com.google.android.gms.internal.ads.zzgci;
import com.google.android.gms.internal.ads.zzgcs;
import com.google.android.gms.internal.ads.zzgdb;
import com.google.android.gms.internal.ads.zzgdm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import nc.q3;
import org.json.JSONException;
import org.json.JSONObject;
import t.m1;
import w2.s1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends zzbyx {
    public static final ArrayList Z = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));

    /* renamed from: a0, reason: collision with root package name */
    public static final ArrayList f19958a0 = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));

    /* renamed from: b0, reason: collision with root package name */
    public static final ArrayList f19959b0 = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));

    /* renamed from: c0, reason: collision with root package name */
    public static final ArrayList f19960c0 = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public zzbug A;
    public final zzdsh D;
    public final zzfjq E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final String J;
    public final String K;
    public final rc.a M;
    public String N;
    public final String O;
    public final ArrayList P;
    public final ArrayList Q;
    public final ArrayList R;
    public final ArrayList S;
    public final zzbeh W;
    public final g0 X;
    public final b0 Y;

    /* renamed from: a, reason: collision with root package name */
    public final zzcgz f19961a;

    /* renamed from: b, reason: collision with root package name */
    public Context f19962b;

    /* renamed from: c, reason: collision with root package name */
    public final zzavs f19963c;

    /* renamed from: d, reason: collision with root package name */
    public final zzfcs f19964d;

    /* renamed from: e, reason: collision with root package name */
    public final zzfdn f19965e;

    /* renamed from: f, reason: collision with root package name */
    public final zzgdm f19966f;

    /* renamed from: z, reason: collision with root package name */
    public final ScheduledExecutorService f19967z;
    public Point B = new Point();
    public Point C = new Point();
    public final AtomicInteger L = new AtomicInteger(0);
    public final AtomicBoolean T = new AtomicBoolean(false);
    public final AtomicBoolean U = new AtomicBoolean(false);
    public final AtomicInteger V = new AtomicInteger(0);

    public l(zzcgz zzcgzVar, Context context, zzavs zzavsVar, zzfdn zzfdnVar, zzgdm zzgdmVar, ScheduledExecutorService scheduledExecutorService, zzdsh zzdshVar, zzfjq zzfjqVar, rc.a aVar, zzbeh zzbehVar, zzfcs zzfcsVar, g0 g0Var, b0 b0Var) {
        ArrayList arrayListA;
        this.f19961a = zzcgzVar;
        this.f19962b = context;
        this.f19963c = zzavsVar;
        this.f19964d = zzfcsVar;
        this.f19965e = zzfdnVar;
        this.f19966f = zzgdmVar;
        this.f19967z = scheduledExecutorService;
        this.D = zzdshVar;
        this.E = zzfjqVar;
        this.M = aVar;
        this.W = zzbehVar;
        zzbct zzbctVar = zzbdc.zzhr;
        nc.t tVar = nc.t.f12227d;
        this.F = ((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue();
        zzbct zzbctVar2 = zzbdc.zzhq;
        zzbda zzbdaVar = tVar.f12230c;
        this.G = ((Boolean) zzbdaVar.zzb(zzbctVar2)).booleanValue();
        this.H = ((Boolean) zzbdaVar.zzb(zzbdc.zzht)).booleanValue();
        this.I = ((Boolean) zzbdaVar.zzb(zzbdc.zzhv)).booleanValue();
        this.J = (String) zzbdaVar.zzb(zzbdc.zzhu);
        this.K = (String) zzbdaVar.zzb(zzbdc.zzhw);
        this.O = (String) zzbdaVar.zzb(zzbdc.zzhx);
        this.X = g0Var;
        this.Y = b0Var;
        if (((Boolean) zzbdaVar.zzb(zzbdc.zzhy)).booleanValue()) {
            this.P = A((String) zzbdaVar.zzb(zzbdc.zzhz));
            this.Q = A((String) zzbdaVar.zzb(zzbdc.zzhA));
            this.R = A((String) zzbdaVar.zzb(zzbdc.zzhB));
            arrayListA = A((String) zzbdaVar.zzb(zzbdc.zzhC));
        } else {
            this.P = Z;
            this.Q = f19958a0;
            this.R = f19959b0;
            arrayListA = f19960c0;
        }
        this.S = arrayListA;
    }

    public static final ArrayList A(String str) {
        String[] strArrSplit = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!zzfvv.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static final Uri B(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i10 = iIndexOf + 1;
        StringBuilder sb2 = new StringBuilder(string.substring(0, i10));
        m1.s(sb2, str, "=", str2, "&");
        sb2.append(string.substring(i10));
        return Uri.parse(sb2.toString());
    }

    public static zzfhm C(mf.a aVar, zzbzc zzbzcVar) {
        if (zzfhp.zza() && ((Boolean) zzbev.zze.zze()).booleanValue()) {
            try {
                zzfhm zzfhmVarZza = ((c) zzgdb.zzp(aVar)).zza();
                zzfhmVarZza.zzd(new ArrayList(Collections.singletonList(zzbzcVar.zzb)));
                q3 q3Var = zzbzcVar.zzd;
                zzfhmVarZza.zzb(q3Var == null ? "" : q3Var.I);
                zzfhmVarZza.zzf(q3Var.F);
                return zzfhmVarZza;
            } catch (ExecutionException e10) {
                mc.n.D.f11582h.zzw(e10, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            }
        }
        return null;
    }

    public static boolean z(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final xc.c n(android.content.Context r39, java.lang.String r40, java.lang.String r41, nc.s3 r42, nc.q3 r43, int r44, java.lang.String r45, android.os.Bundle r46, com.google.android.gms.internal.ads.zzbzc r47) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc.l.n(android.content.Context, java.lang.String, java.lang.String, nc.s3, nc.q3, int, java.lang.String, android.os.Bundle, com.google.android.gms.internal.ads.zzbzc):xc.c");
    }

    public final zzgcs u(final String str) {
        final zzdnr[] zzdnrVarArr = new zzdnr[1];
        mf.a aVarZza = this.f19965e.zza();
        zzgci zzgciVar = new zzgci() { // from class: xc.e
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) throws JSONException {
                zzdnr zzdnrVar = (zzdnr) obj;
                zzdnrVarArr[0] = zzdnrVar;
                l lVar = this.f19917a;
                Context context = lVar.f19962b;
                zzbug zzbugVar = lVar.A;
                Map map = zzbugVar.zzb;
                JSONObject jSONObjectL = mk.b.L(context, map, map, zzbugVar.zza, null);
                JSONObject jSONObjectP = mk.b.P(lVar.f19962b, lVar.A.zza);
                JSONObject jSONObjectO = mk.b.O(lVar.A.zza);
                JSONObject jSONObjectM = mk.b.M(lVar.f19962b, lVar.A.zza);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("asset_view_signal", jSONObjectL);
                jSONObject.put("ad_view_signal", jSONObjectP);
                jSONObject.put("scroll_view_signal", jSONObjectO);
                jSONObject.put("lock_screen_signal", jSONObjectM);
                String str2 = str;
                if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str2)) {
                    jSONObject.put("click_signal", mk.b.K(null, lVar.f19962b, lVar.C, lVar.B));
                }
                return zzdnrVar.zzg(str2, jSONObject);
            }
        };
        zzgdm zzgdmVar = this.f19966f;
        mf.a aVarZzn = zzgdb.zzn(aVarZza, zzgciVar, zzgdmVar);
        aVarZzn.addListener(new f(0, this, zzdnrVarArr), zzgdmVar);
        final int i10 = 0;
        zzgcs zzgcsVar = (zzgcs) zzgdb.zzm((zzgcs) zzgdb.zzo(zzgcs.zzw(aVarZzn), ((Integer) nc.t.f12227d.f12230c.zzb(zzbdc.zzhP)).intValue(), TimeUnit.MILLISECONDS, this.f19967z), new zzfut() { // from class: xc.j
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                switch (i10) {
                    case 0:
                        ArrayList arrayList = l.Z;
                        return ((JSONObject) obj).optString("nas");
                    default:
                        ArrayList arrayList2 = l.Z;
                        int i11 = qc.l0.f13401b;
                        rc.k.e("", (Exception) obj);
                        return null;
                }
            }
        }, zzgdmVar);
        final int i11 = 1;
        return (zzgcs) zzgdb.zze(zzgcsVar, Exception.class, new zzfut() { // from class: xc.j
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                switch (i11) {
                    case 0:
                        ArrayList arrayList = l.Z;
                        return ((JSONObject) obj).optString("nas");
                    default:
                        ArrayList arrayList2 = l.Z;
                        int i112 = qc.l0.f13401b;
                        rc.k.e("", (Exception) obj);
                        return null;
                }
            }
        }, zzgdmVar);
    }

    public final void v() {
        l lVar;
        mf.a aVarZzb;
        if (((Boolean) zzbfh.zze.zze()).booleanValue()) {
            g0 g0Var = this.X;
            synchronized (g0Var) {
                g0Var.c(true);
                g0Var.c(false);
            }
            return;
        }
        if (((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzlp)).booleanValue()) {
            aVarZzb = zzgdb.zzk(new s1(this, 4), zzcad.zza);
            lVar = this;
        } else {
            lVar = this;
            aVarZzb = lVar.n(this.f19962b, null, "BANNER", null, null, 0, null, new Bundle(), null).zzb();
        }
        zzgdb.zzr(aVarZzb, new ld.i(this, 29), lVar.f19961a.zzA());
    }

    public final void w() {
        zzbct zzbctVar = zzbdc.zzjO;
        nc.t tVar = nc.t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            if (((Boolean) tVar.f12230c.zzb(zzbdc.zzjR)).booleanValue()) {
                return;
            }
            if (((Boolean) tVar.f12230c.zzb(zzbdc.zzjV)).booleanValue() && this.T.getAndSet(true)) {
                return;
            }
            v();
        }
    }

    public final void x(List list, xd.a aVar, zzbud zzbudVar, boolean z2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        mf.a aVarZzn;
        Map map;
        if (!((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzhO)).booleanValue()) {
            int i10 = qc.l0.f13401b;
            rc.k.g("The updating URL feature is not enabled.");
            try {
                zzbudVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e10) {
                rc.k.e("", e10);
                return;
            }
        }
        Iterator it = list.iterator();
        int i11 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = this.Q;
            arrayList2 = this.P;
            if (!zHasNext) {
                break;
            } else if (z((Uri) it.next(), arrayList2, arrayList)) {
                i11++;
            }
        }
        int i12 = 1;
        if (i11 > 1) {
            String strValueOf = String.valueOf(list);
            int i13 = qc.l0.f13401b;
            rc.k.g("Multiple google urls found: ".concat(strValueOf));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Uri uri = (Uri) it2.next();
            if (z(uri, arrayList2, arrayList)) {
                w8.j jVar = new w8.j(this, uri, aVar, 2);
                zzgdm zzgdmVar = this.f19966f;
                mf.a aVarZzb = zzgdmVar.zzb(jVar);
                zzbug zzbugVar = this.A;
                if (zzbugVar == null || (map = zzbugVar.zzb) == null || map.isEmpty()) {
                    int i14 = qc.l0.f13401b;
                    rc.k.f("Asset view map is empty.");
                    aVarZzn = aVarZzb;
                } else {
                    aVarZzn = zzgdb.zzn(aVarZzb, new g(this, 0), zzgdmVar);
                }
            } else {
                String strValueOf2 = String.valueOf(uri);
                int i15 = qc.l0.f13401b;
                rc.k.g("Not a Google URL: ".concat(strValueOf2));
                aVarZzn = zzgdb.zzh(uri);
            }
            arrayList3.add(aVarZzn);
        }
        zzgdb.zzr(zzgdb.zzd(arrayList3), new k(this, zzbudVar, z2, i12), this.f19961a.zzA());
    }

    public final void y(List list, xd.a aVar, zzbud zzbudVar, boolean z2) {
        Map map;
        if (!((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzhO)).booleanValue()) {
            try {
                zzbudVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e10) {
                int i10 = qc.l0.f13401b;
                rc.k.e("", e10);
                return;
            }
        }
        w8.j jVar = new w8.j(this, list, aVar, 3);
        zzgdm zzgdmVar = this.f19966f;
        mf.a aVarZzb = zzgdmVar.zzb(jVar);
        zzbug zzbugVar = this.A;
        if (zzbugVar == null || (map = zzbugVar.zzb) == null || map.isEmpty()) {
            int i11 = qc.l0.f13401b;
            rc.k.f("Asset view map is empty.");
        } else {
            aVarZzb = zzgdb.zzn(aVarZzb, new g(this, 1), zzgdmVar);
        }
        zzgdb.zzr(aVarZzb, new k(this, zzbudVar, z2, 0), this.f19961a.zzA());
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final xd.a zze(xd.a aVar, xd.a aVar2, String str, xd.a aVar3) throws JSONException {
        if (!((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzkb)).booleanValue()) {
            return new xd.b(null);
        }
        Context context = (Context) xd.b.u(aVar);
        p.g gVar = (p.g) xd.b.u(aVar2);
        p.a aVar4 = (p.a) xd.b.u(aVar3);
        zzbeh zzbehVar = this.W;
        zzbehVar.zzg(context, gVar, str, aVar4);
        if (((Boolean) zzbfh.zze.zze()).booleanValue()) {
            g0 g0Var = this.X;
            synchronized (g0Var) {
                g0Var.c(true);
                g0Var.c(false);
            }
        }
        if (((Boolean) zzbfh.zzc.zze()).booleanValue()) {
            this.Y.b(null);
        }
        return new xd.b(zzbehVar.zzb());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8  */
    @Override // com.google.android.gms.internal.ads.zzbyy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(xd.a r11, com.google.android.gms.internal.ads.zzbzc r12, com.google.android.gms.internal.ads.zzbyv r13) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc.l.zzf(xd.a, com.google.android.gms.internal.ads.zzbzc, com.google.android.gms.internal.ads.zzbyv):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final void zzg(zzbug zzbugVar) {
        this.A = zzbugVar;
        this.f19965e.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final void zzh(List list, xd.a aVar, zzbud zzbudVar) {
        x(list, aVar, zzbudVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final void zzi(List list, xd.a aVar, zzbud zzbudVar) {
        y(list, aVar, zzbudVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final void zzj(xd.a aVar) throws JSONException {
        zzbct zzbctVar = zzbdc.zzjN;
        nc.t tVar = nc.t.f12227d;
        zzbda zzbdaVar = tVar.f12230c;
        zzbda zzbdaVar2 = tVar.f12230c;
        if (((Boolean) zzbdaVar.zzb(zzbctVar)).booleanValue()) {
            zzbct zzbctVar2 = zzbdc.zzhF;
            if (!((Boolean) zzbdaVar2.zzb(zzbctVar2)).booleanValue()) {
                w();
            }
            WebView webView = (WebView) xd.b.u(aVar);
            if (webView == null) {
                int i10 = qc.l0.f13401b;
                rc.k.d("The webView cannot be null.");
                return;
            }
            zzgdm zzgdmVar = zzcad.zzf;
            b0 b0Var = this.Y;
            e0 e0Var = new e0(webView, b0Var, zzgdmVar);
            webView.addJavascriptInterface(new a(webView, this.f19963c, this.D, this.E, this.f19964d, this.X, b0Var, e0Var), "gmaSdk");
            if (((Boolean) zzbdaVar2.zzb(zzbdc.zzjX)).booleanValue()) {
                mc.n.D.f11582h.zzs();
            }
            if (((Boolean) zzbfh.zzc.zze()).booleanValue()) {
                b0Var.b(webView);
                if (((Boolean) zzbfh.zzd.zze()).booleanValue()) {
                    zzcad.zzd.scheduleWithFixedDelay(new d0(e0Var, 1), 0L, ((Integer) zzbdaVar2.zzb(zzbdc.zzjY)).intValue(), TimeUnit.MILLISECONDS);
                }
            }
            if (((Boolean) zzbdaVar2.zzb(zzbctVar2)).booleanValue()) {
                w();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final void zzk(xd.a aVar) {
        if (((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzhO)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) xd.b.u(aVar);
            zzbug zzbugVar = this.A;
            View view = zzbugVar == null ? null : zzbugVar.zza;
            int[] iArr = new int[2];
            if (view != null) {
                view.getLocationOnScreen(iArr);
            }
            this.B = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
            if (motionEvent.getAction() == 0) {
                this.C = this.B;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Point point = this.B;
            motionEventObtain.setLocation(point.x, point.y);
            this.f19963c.zzd(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final void zzl(List list, xd.a aVar, zzbud zzbudVar) {
        x(list, aVar, zzbudVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final void zzm(List list, xd.a aVar, zzbud zzbudVar) {
        y(list, aVar, zzbudVar, false);
    }
}
