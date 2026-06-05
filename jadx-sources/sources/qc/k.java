package qc;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzdux;
import com.google.android.gms.internal.ads.zzdvb;
import com.google.android.gms.internal.ads.zzfrn;
import com.google.android.gms.internal.ads.zzgdm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13383a;

    /* renamed from: b, reason: collision with root package name */
    public final zzdvb f13384b;

    /* renamed from: c, reason: collision with root package name */
    public String f13385c;

    /* renamed from: d, reason: collision with root package name */
    public String f13386d;

    /* renamed from: e, reason: collision with root package name */
    public String f13387e;

    /* renamed from: f, reason: collision with root package name */
    public String f13388f;

    /* renamed from: h, reason: collision with root package name */
    public final int f13390h;

    /* renamed from: i, reason: collision with root package name */
    public PointF f13391i;
    public PointF j;

    /* renamed from: k, reason: collision with root package name */
    public final zzfrn f13392k;

    /* renamed from: g, reason: collision with root package name */
    public int f13389g = 0;

    /* renamed from: l, reason: collision with root package name */
    public final c f13393l = new c(this, 1);

    public k(Context context) {
        this.f13383a = context;
        this.f13390h = ViewConfiguration.get(context).getScaledTouchSlop();
        mc.n nVar = mc.n.D;
        nVar.f11593t.b();
        this.f13392k = (zzfrn) nVar.f11593t.f11640c;
        this.f13384b = nVar.f11588o.f13412g;
    }

    public static final int e(ArrayList arrayList, String str, boolean z2) {
        if (!z2) {
            return -1;
        }
        arrayList.add(str);
        return arrayList.size() - 1;
    }

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f13389g = 0;
            this.f13391i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i10 = this.f13389g;
        if (i10 == -1) {
            return;
        }
        c cVar = this.f13393l;
        zzfrn zzfrnVar = this.f13392k;
        if (i10 == 0) {
            if (actionMasked == 5) {
                this.f13389g = 5;
                this.j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                zzfrnVar.postDelayed(cVar, ((Long) nc.t.f12227d.f12230c.zzb(zzbdc.zzfb)).longValue());
                return;
            }
            return;
        }
        if (i10 == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z2 = false;
                for (int i11 = 0; i11 < historySize; i11++) {
                    z2 |= !d(motionEvent.getHistoricalX(0, i11), motionEvent.getHistoricalY(0, i11), motionEvent.getHistoricalX(1, i11), motionEvent.getHistoricalY(1, i11));
                }
                if (d(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z2) {
                    return;
                }
            }
            this.f13389g = -1;
            zzfrnVar.removeCallbacks(cVar);
        }
    }

    public final void b() {
        String str;
        try {
            Context context = this.f13383a;
            if (!(context instanceof Activity)) {
                int i10 = l0.f13401b;
                rc.k.f("Can not create dialog without Activity Context");
                return;
            }
            mc.n nVar = mc.n.D;
            n nVar2 = nVar.f11588o;
            synchronized (nVar2.f13406a) {
                str = nVar2.f13408c;
            }
            String str2 = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(str)) {
                str2 = "Creative preview";
            }
            String str3 = true != nVar.f11588o.h() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iE = e(arrayList, "Ad information", true);
            final int iE2 = e(arrayList, str2, true);
            final int iE3 = e(arrayList, str3, true);
            boolean zBooleanValue = ((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzjv)).booleanValue();
            final int iE4 = e(arrayList, "Open ad inspector", zBooleanValue);
            final int iE5 = e(arrayList, "Ad inspector settings", zBooleanValue);
            AlertDialog.Builder builderJ = r0.j(context);
            builderJ.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: qc.g
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    final k kVar = this.f13355a;
                    zzdvb zzdvbVar = kVar.f13384b;
                    if (i11 != iE) {
                        if (i11 == iE2) {
                            int i12 = l0.f13401b;
                            rc.k.b("Debug mode [Creative Preview] selected.");
                            zzcad.zza.execute(new c(kVar, 2));
                            return;
                        }
                        if (i11 == iE3) {
                            int i13 = l0.f13401b;
                            rc.k.b("Debug mode [Troubleshooting] selected.");
                            zzcad.zza.execute(new c(kVar, 6));
                            return;
                        }
                        if (i11 == iE4) {
                            final zzgdm zzgdmVar = zzcad.zzf;
                            zzgdm zzgdmVar2 = zzcad.zza;
                            if (zzdvbVar.zzq()) {
                                zzgdmVar.execute(new c(kVar, 5));
                                return;
                            } else {
                                final int i14 = 1;
                                zzgdmVar2.execute(new Runnable() { // from class: qc.f
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                mc.n nVar3 = mc.n.D;
                                                n nVar4 = nVar3.f11588o;
                                                k kVar2 = kVar;
                                                Context context2 = kVar2.f13383a;
                                                if (!nVar4.f(context2, kVar2.f13386d, kVar2.f13387e)) {
                                                    nVar3.f11588o.b(context2, kVar2.f13386d, kVar2.f13387e);
                                                    break;
                                                } else {
                                                    zzgdmVar.execute(new c(kVar2, 4));
                                                    break;
                                                }
                                            default:
                                                mc.n nVar5 = mc.n.D;
                                                n nVar6 = nVar5.f11588o;
                                                k kVar3 = kVar;
                                                Context context3 = kVar3.f13383a;
                                                if (!nVar6.f(context3, kVar3.f13386d, kVar3.f13387e)) {
                                                    nVar5.f11588o.b(context3, kVar3.f13386d, kVar3.f13387e);
                                                    break;
                                                } else {
                                                    zzgdmVar.execute(new c(kVar3, 3));
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        if (i11 == iE5) {
                            final zzgdm zzgdmVar3 = zzcad.zzf;
                            zzgdm zzgdmVar4 = zzcad.zza;
                            final int i15 = 0;
                            if (zzdvbVar.zzq()) {
                                zzgdmVar3.execute(new c(kVar, i15));
                                return;
                            } else {
                                zzgdmVar4.execute(new Runnable() { // from class: qc.f
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i15) {
                                            case 0:
                                                mc.n nVar3 = mc.n.D;
                                                n nVar4 = nVar3.f11588o;
                                                k kVar2 = kVar;
                                                Context context2 = kVar2.f13383a;
                                                if (!nVar4.f(context2, kVar2.f13386d, kVar2.f13387e)) {
                                                    nVar3.f11588o.b(context2, kVar2.f13386d, kVar2.f13387e);
                                                    break;
                                                } else {
                                                    zzgdmVar3.execute(new c(kVar2, 4));
                                                    break;
                                                }
                                            default:
                                                mc.n nVar5 = mc.n.D;
                                                n nVar6 = nVar5.f11588o;
                                                k kVar3 = kVar;
                                                Context context3 = kVar3.f13383a;
                                                if (!nVar6.f(context3, kVar3.f13386d, kVar3.f13387e)) {
                                                    nVar5.f11588o.b(context3, kVar3.f13386d, kVar3.f13387e);
                                                    break;
                                                } else {
                                                    zzgdmVar3.execute(new c(kVar3, 3));
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        return;
                    }
                    Context context2 = kVar.f13383a;
                    if (!(context2 instanceof Activity)) {
                        int i16 = l0.f13401b;
                        rc.k.f("Can not create dialog without Activity Context");
                        return;
                    }
                    String str4 = kVar.f13385c;
                    final String str5 = "No debug information";
                    if (!TextUtils.isEmpty(str4)) {
                        Uri uriBuild = new Uri.Builder().encodedQuery(str4.replaceAll("\\+", "%20")).build();
                        StringBuilder sb2 = new StringBuilder();
                        r0 r0Var = mc.n.D.f11577c;
                        HashMap mapM = r0.m(uriBuild);
                        for (String str6 : mapM.keySet()) {
                            sb2.append(str6);
                            sb2.append(" = ");
                            sb2.append((String) mapM.get(str6));
                            sb2.append("\n\n");
                        }
                        String strTrim = sb2.toString().trim();
                        if (!TextUtils.isEmpty(strTrim)) {
                            str5 = strTrim;
                        }
                    }
                    r0 r0Var2 = mc.n.D.f11577c;
                    AlertDialog.Builder builderJ2 = r0.j(context2);
                    builderJ2.setMessage(str5);
                    builderJ2.setTitle("Ad Information");
                    builderJ2.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: qc.d
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i17) {
                            r0 r0Var3 = mc.n.D.f11577c;
                            r0.q(kVar.f13383a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str5), "Share via"));
                        }
                    });
                    builderJ2.setNegativeButton("Close", new e());
                    builderJ2.create().show();
                }
            });
            builderJ.create().show();
        } catch (WindowManager.BadTokenException e10) {
            l0.l("", e10);
        }
    }

    public final void c(Context context) {
        ArrayList arrayList = new ArrayList();
        int iE = e(arrayList, "None", true);
        final int iE2 = e(arrayList, "Shake", true);
        final int iE3 = e(arrayList, "Flick", true);
        int iOrdinal = this.f13384b.zza().ordinal();
        final int i10 = iOrdinal != 1 ? iOrdinal != 2 ? iE : iE3 : iE2;
        r0 r0Var = mc.n.D.f11577c;
        AlertDialog.Builder builderJ = r0.j(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i10);
        builderJ.setTitle("Setup gesture");
        builderJ.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i10, new h(atomicInteger, 0));
        builderJ.setNegativeButton("Dismiss", new h(this, 1));
        builderJ.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: qc.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                AtomicInteger atomicInteger2 = atomicInteger;
                int i12 = atomicInteger2.get();
                k kVar = this.f13368a;
                if (i12 != i10) {
                    if (atomicInteger2.get() == iE2) {
                        kVar.f13384b.zzm(zzdux.SHAKE);
                    } else if (atomicInteger2.get() == iE3) {
                        kVar.f13384b.zzm(zzdux.FLICK);
                    } else {
                        kVar.f13384b.zzm(zzdux.NONE);
                    }
                }
                kVar.b();
            }
        });
        builderJ.setOnCancelListener(new j(this, 0));
        builderJ.create().show();
    }

    public final boolean d(float f10, float f11, float f12, float f13) {
        float fAbs = Math.abs(this.f13391i.x - f10);
        int i10 = this.f13390h;
        return fAbs < ((float) i10) && Math.abs(this.f13391i.y - f11) < ((float) i10) && Math.abs(this.j.x - f12) < ((float) i10) && Math.abs(this.j.y - f13) < ((float) i10);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("{Dialog: ");
        sb2.append(this.f13385c);
        sb2.append(",DebugSignal: ");
        sb2.append(this.f13388f);
        sb2.append(",AFMA Version: ");
        sb2.append(this.f13387e);
        sb2.append(",Ad Unit ID: ");
        return m6.a.j(sb2, this.f13386d, "}");
    }
}
