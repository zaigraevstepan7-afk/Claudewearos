package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mc.n;
import nc.t;
import qc.r0;
import rc.h;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfjm {
    private final zzegt zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfcg zzf;
    private final zzfch zzg;
    private final ud.a zzh;
    private final zzavs zzi;

    public zzfjm(zzegt zzegtVar, rc.a aVar, String str, String str2, Context context, zzfcg zzfcgVar, zzfch zzfchVar, ud.a aVar2, zzavs zzavsVar) {
        this.zza = zzegtVar;
        this.zzb = aVar.f14321a;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfcgVar;
        this.zzg = zzfchVar;
        this.zzh = aVar2;
        this.zzi = zzavsVar;
    }

    public static String zzc(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzg(String str) {
        return TextUtils.isEmpty(str) ? "" : h.c() ? "fakeForAdDebugLog" : str;
    }

    public final List zzd(zzfcf zzfcfVar, zzfbt zzfbtVar, List list) {
        return zze(zzfcfVar, zzfbtVar, false, "", "", list);
    }

    public final List zze(zzfcf zzfcfVar, zzfbt zzfbtVar, boolean z2, String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z10 = true;
            String strZzc = zzc(zzc(zzc((String) it.next(), "@gw_adlocid@", zzfcfVar.zza.zza.zzf), "@gw_adnetrefresh@", true != z2 ? "0" : "1"), "@gw_sdkver@", this.zzb);
            if (zzfbtVar != null) {
                String strZzc2 = zzc(zzc(zzc(strZzc, "@gw_qdata@", zzfbtVar.zzy), "@gw_adnetid@", zzfbtVar.zzx), "@gw_allocid@", zzfbtVar.zzw);
                Context context = this.zze;
                strZzc = zzbyo.zzc(strZzc2, context, zzfbtVar.zzW, zzfbtVar.zzaw);
                if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zznz)).booleanValue() && zzfbtVar.zze == 4) {
                    r0 r0Var = n.D.f11577c;
                    strZzc = zzc(strZzc, "@gw_aps@", true != r0.f(context) ? "0" : "1");
                }
            }
            zzegt zzegtVar = this.zza;
            String strZzc3 = zzc(zzc(zzc(zzc(strZzc, "@gw_adnetstatus@", zzegtVar.zzg()), "@gw_ttr@", Long.toString(zzegtVar.zza(), 10)), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            boolean z11 = false;
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzdM)).booleanValue() && !TextUtils.isEmpty(str)) {
                z11 = true;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean z12 = !zIsEmpty;
            if (z11) {
                z10 = z12;
            } else {
                if (!zIsEmpty) {
                }
                arrayList.add(strZzc3);
            }
            if (this.zzi.zzf(Uri.parse(strZzc3))) {
                Uri.Builder builderBuildUpon = Uri.parse(strZzc3).buildUpon();
                if (z11) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                }
                if (z10) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                }
                strZzc3 = builderBuildUpon.build().toString();
            }
            arrayList.add(strZzc3);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006b A[LOOP:0: B:13:0x0065->B:15:0x006b, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzf(com.google.android.gms.internal.ads.zzfbt r11, java.util.List r12, com.google.android.gms.internal.ads.zzbwa r13) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            ud.a r1 = r10.zzh
            ud.b r1 = (ud.b) r1
            r1.getClass()
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = r13.zzc()     // Catch: android.os.RemoteException -> Lb6
            int r13 = r13.zzb()     // Catch: android.os.RemoteException -> Lb6
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch: android.os.RemoteException -> Lb6
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.internal.ads.zzbdc.zzdN
            nc.t r5 = nc.t.f12227d
            com.google.android.gms.internal.ads.zzbda r5 = r5.f12230c
            java.lang.Object r4 = r5.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L3e
            com.google.android.gms.internal.ads.zzfch r4 = r10.zzg
            if (r4 != 0) goto L37
            com.google.android.gms.internal.ads.zzfvc r4 = com.google.android.gms.internal.ads.zzfvc.zzc()
            goto L41
        L37:
            com.google.android.gms.internal.ads.zzfcg r4 = r4.zza
        L39:
            com.google.android.gms.internal.ads.zzfvc r4 = com.google.android.gms.internal.ads.zzfvc.zzd(r4)
            goto L41
        L3e:
            com.google.android.gms.internal.ads.zzfcg r4 = r10.zzf
            goto L39
        L41:
            com.google.android.gms.internal.ads.zzfjk r5 = new com.google.android.gms.internal.ads.zzfjk
            r5.<init>()
            com.google.android.gms.internal.ads.zzfvc r5 = r4.zza(r5)
            java.lang.String r6 = ""
            java.lang.Object r5 = r5.zzb(r6)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzfjl r7 = new com.google.android.gms.internal.ads.zzfjl
            r7.<init>()
            com.google.android.gms.internal.ads.zzfvc r4 = r4.zza(r7)
            java.lang.Object r4 = r4.zzb(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Iterator r12 = r12.iterator()
        L65:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto Lb5
            java.lang.Object r6 = r12.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = android.net.Uri.encode(r5)
            java.lang.String r8 = "@gw_rwd_userid@"
            java.lang.String r6 = zzc(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r4)
            java.lang.String r8 = "@gw_rwd_custom_data@"
            java.lang.String r6 = zzc(r6, r8, r7)
            java.lang.String r7 = java.lang.Long.toString(r1)
            java.lang.String r8 = "@gw_tmstmp@"
            java.lang.String r6 = zzc(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r3)
            java.lang.String r8 = "@gw_rwd_itm@"
            java.lang.String r6 = zzc(r6, r8, r7)
            java.lang.String r7 = "@gw_rwd_amt@"
            java.lang.String r6 = zzc(r6, r7, r13)
            java.lang.String r7 = r10.zzb
            java.lang.String r8 = "@gw_sdkver@"
            java.lang.String r6 = zzc(r6, r8, r7)
            android.content.Context r7 = r10.zze
            boolean r8 = r11.zzW
            java.util.Map r9 = r11.zzaw
            java.lang.String r6 = com.google.android.gms.internal.ads.zzbyo.zzc(r6, r7, r8, r9)
            r0.add(r6)
            goto L65
        Lb5:
            return r0
        Lb6:
            r11 = move-exception
            int r12 = qc.l0.f13401b
            java.lang.String r12 = "Unable to determine award type and amount."
            rc.k.e(r12, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfjm.zzf(com.google.android.gms.internal.ads.zzfbt, java.util.List, com.google.android.gms.internal.ads.zzbwa):java.util.List");
    }
}
