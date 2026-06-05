package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.concurrent.Executor;
import nc.t;
import qc.l0;
import qc.n0;
import qc.o0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdjm {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final n0 zzb;
    private final zzfco zzc;
    private final zzdir zzd;
    private final zzdim zze;
    private final zzdka zzf;
    private final zzdki zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbgc zzj;
    private final zzdij zzk;

    public zzdjm(n0 n0Var, zzfco zzfcoVar, zzdir zzdirVar, zzdim zzdimVar, zzdka zzdkaVar, zzdki zzdkiVar, Executor executor, Executor executor2, zzdij zzdijVar) {
        this.zzb = n0Var;
        this.zzc = zzfcoVar;
        this.zzj = zzfcoVar.zzi;
        this.zzd = zzdirVar;
        this.zze = zzdimVar;
        this.zzf = zzdkaVar;
        this.zzg = zzdkiVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdijVar;
    }

    public static /* synthetic */ void zza(zzdjm zzdjmVar, ViewGroup viewGroup) {
        zzdim zzdimVar = zzdjmVar.zze;
        if (zzdimVar.zzf() != null) {
            boolean z2 = viewGroup != null;
            if (zzdimVar.zzc() == 2 || zzdimVar.zzc() == 1) {
                n0 n0Var = zzdjmVar.zzb;
                o0 o0Var = (o0) n0Var;
                o0Var.e(zzdjmVar.zzc.zzf, String.valueOf(zzdimVar.zzc()), z2);
                return;
            }
            if (zzdimVar.zzc() == 6) {
                n0 n0Var2 = zzdjmVar.zzb;
                String str = zzdjmVar.zzc.zzf;
                o0 o0Var2 = (o0) n0Var2;
                o0Var2.e(str, "2", z2);
                o0Var2.e(str, "1", z2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void zzb(final com.google.android.gms.internal.ads.zzdjm r10, com.google.android.gms.internal.ads.zzdkk r11) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdjm.zzb(com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzdkk):void");
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i10) {
        if (i10 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i10 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i10 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean zzi(ViewGroup viewGroup, boolean z2) {
        View viewZzf = z2 ? this.zze.zzf() : this.zze.zzg();
        if (viewZzf == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewZzf.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewZzf.getParent()).removeView(viewZzf);
        }
        viewGroup.addView(viewZzf, ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzed)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    public final void zzc(zzdkk zzdkkVar) {
        zzdka zzdkaVar;
        if (zzdkkVar == null || (zzdkaVar = this.zzf) == null || zzdkkVar.zzh() == null || !this.zzd.zzg()) {
            return;
        }
        try {
            zzdkkVar.zzh().addView(zzdkaVar.zza());
        } catch (zzcfq e10) {
            l0.l("web view can not be obtained", e10);
        }
    }

    public final void zzd(zzdkk zzdkkVar) {
        if (zzdkkVar == null) {
            return;
        }
        Context context = zzdkkVar.zzf().getContext();
        if (mk.b.Q(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                int i10 = l0.f13401b;
                k.b("Activity context is needed for policy validator.");
                return;
            }
            zzdki zzdkiVar = this.zzg;
            if (zzdkiVar == null || zzdkkVar.zzh() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(zzdkiVar.zza(zzdkkVar.zzh(), windowManager), mk.b.J());
            } catch (zzcfq e10) {
                l0.l("web view can not be obtained", e10);
            }
        }
    }

    public final void zze(final zzdkk zzdkkVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjk
            @Override // java.lang.Runnable
            public final void run() {
                zzdjm.zzb(this.zza, zzdkkVar);
            }
        });
    }

    public final boolean zzf(ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    public final boolean zzg(ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }
}
