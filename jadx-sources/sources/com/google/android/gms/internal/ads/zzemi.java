package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowInsets;
import android.view.WindowManager;
import nc.s3;
import nc.t;
import qc.o0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzemi implements zzetu {
    private final zzetu zza;
    private final zzfco zzb;
    private final Context zzc;
    private final zzbzq zzd;

    public zzemi(zzeom zzeomVar, zzfco zzfcoVar, Context context, zzbzq zzbzqVar) {
        this.zza = zzeomVar;
        this.zzb = zzfcoVar;
        this.zzc = context;
        this.zzd = zzbzqVar;
    }

    public static zzemj zzc(zzemi zzemiVar, zzeud zzeudVar) {
        String str;
        boolean z2;
        String strO;
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        DisplayMetrics displayMetrics;
        zzfco zzfcoVar = zzemiVar.zzb;
        s3 s3Var = zzfcoVar.zze;
        s3[] s3VarArr = s3Var.f12226z;
        if (s3VarArr != null) {
            str = null;
            z2 = false;
            boolean z10 = false;
            boolean z11 = false;
            for (s3 s3Var2 : s3VarArr) {
                boolean z12 = s3Var2.B;
                if (!z12 && !z10) {
                    str = s3Var2.f12220a;
                    z10 = true;
                }
                if (z12) {
                    if (!z11) {
                        z2 = true;
                    }
                    z11 = true;
                }
                if (z10 && z11) {
                    break;
                }
            }
        } else {
            str = s3Var.f12220a;
            z2 = s3Var.B;
        }
        Context context = zzemiVar.zzc;
        Resources resources = context.getResources();
        int i13 = Build.VERSION.SDK_INT;
        Insets insetsOf = i13 >= 29 ? Insets.NONE : null;
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            strO = null;
            i10 = 0;
            i11 = 0;
            f10 = 0.0f;
        } else {
            zzbzq zzbzqVar = zzemiVar.zzd;
            f10 = displayMetrics.density;
            i11 = displayMetrics.widthPixels;
            int i14 = displayMetrics.heightPixels;
            strO = ((o0) zzbzqVar.zzi()).o();
            i10 = i14;
        }
        if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zznw)).booleanValue() || i13 < 35) {
            f11 = 0.0f;
            i12 = i11;
        } else {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null || f10 == 0.0f) {
                f11 = 0.0f;
                i12 = i11;
                insetsOf = Insets.NONE;
            } else {
                Insets insets = windowManager.getCurrentWindowMetrics().getWindowInsets().getInsets(WindowInsets.Type.statusBars() | WindowInsets.Type.displayCutout() | WindowInsets.Type.navigationBars() | WindowInsets.Type.captionBar());
                f11 = 0.0f;
                i12 = i11;
                insetsOf = Insets.of((int) Math.ceil(insets.left / f10), (int) Math.ceil(insets.top / f10), (int) Math.ceil(insets.right / f10), (int) Math.ceil(insets.bottom / f10));
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (s3VarArr != null) {
            int i15 = 0;
            boolean z13 = false;
            while (i15 < s3VarArr.length) {
                s3 s3Var3 = s3VarArr[i15];
                float f12 = f11;
                if (s3Var3.B) {
                    z13 = true;
                } else {
                    if (sb2.length() != 0) {
                        sb2.append("|");
                    }
                    int i16 = s3Var3.f12224e;
                    if (i16 == -1) {
                        i16 = f10 != f12 ? (int) (s3Var3.f12225f / f10) : -1;
                    }
                    sb2.append(i16);
                    sb2.append("x");
                    int i17 = s3Var3.f12221b;
                    if (i17 == -2) {
                        i17 = f10 != f12 ? (int) (s3Var3.f12222c / f10) : -2;
                    }
                    sb2.append(i17);
                }
                i15++;
                f11 = f12;
            }
            if (z13) {
                if (sb2.length() != 0) {
                    sb2.insert(0, "|");
                }
                sb2.insert(0, "320x50");
            }
        }
        return new zzemj(s3Var, str, z2, sb2.toString(), f10, i12, i10, strO, zzfcoVar.zzq, insetsOf);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        return zzgdb.zzm(this.zza.zzb(), new zzfut() { // from class: com.google.android.gms.internal.ads.zzemh
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                return zzemi.zzc(this.zza, (zzeud) obj);
            }
        }, zzcad.zzg);
    }
}
