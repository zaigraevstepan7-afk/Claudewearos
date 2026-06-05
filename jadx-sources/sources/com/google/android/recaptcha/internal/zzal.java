package com.google.android.recaptcha.internal;

import android.app.Application;
import android.os.Build;
import ej.e;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import pi.o;
import qj.z;
import t.m1;
import ti.c;
import ui.a;
import vi.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzal extends i implements e {
    final /* synthetic */ Application zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbd zzc;
    final /* synthetic */ zzbq zzd;
    final /* synthetic */ zzab zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzal(Application application, String str, zzbd zzbdVar, zzbq zzbqVar, zzab zzabVar, c cVar) {
        super(2, cVar);
        this.zza = application;
        this.zzb = str;
        this.zzc = zzbdVar;
        this.zzd = zzbqVar;
        this.zze = zzabVar;
    }

    @Override // vi.a
    public final c create(Object obj, c cVar) {
        return new zzal(this.zza, this.zzb, this.zzc, this.zzd, this.zze, cVar);
    }

    @Override // ej.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzal) create((z) obj, (c) obj2)).invokeSuspend(o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) throws UnsupportedEncodingException {
        a aVar = a.f17085a;
        uk.c.R(obj);
        zzaf zzafVar = zzaf.zza;
        zzbd zzbdVar = this.zzc;
        Application application = this.zza;
        String strZza = zzaf.zza(application);
        String packageName = application.getPackageName();
        String strZzd = zzbdVar.zzd();
        zzq zzqVar = new zzq(application);
        int i10 = Build.VERSION.SDK_INT;
        String strZza2 = zzqVar.zza("_GRECAPTCHA_KC");
        if (strZza2 == null) {
            strZza2 = "";
        }
        String strEncode = URLEncoder.encode(this.zzb, "UTF-8");
        String strEncode2 = URLEncoder.encode(packageName, "UTF-8");
        String strEncode3 = URLEncoder.encode(strZza, "UTF-8");
        String strEncode4 = URLEncoder.encode("18.4.0", "UTF-8");
        String strEncode5 = URLEncoder.encode(strZzd, "UTF-8");
        StringBuilder sbM = m1.m("k=", strEncode, "&pk=", strEncode2, "&mst=");
        m1.s(sbM, strEncode3, "&msv=", strEncode4, "&msi=");
        sbM.append(strEncode5);
        sbM.append("&mov=");
        sbM.append(i10);
        sbM.append("&mkc=");
        sbM.append(strZza2);
        byte[] bytes = sbM.toString().getBytes(Charset.forName("UTF-8"));
        zzbq zzbqVar = this.zzd;
        zzab zzabVar = this.zze;
        return zzbqVar.zza(zzabVar.zzb(), bytes, this.zzc);
    }
}
