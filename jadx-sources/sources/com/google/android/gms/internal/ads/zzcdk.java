package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzcdk implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzcdl zze;

    public zzcdk(zzcdl zzcdlVar, String str, String str2, String str3, String str4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = zzcdlVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "event"
            java.lang.String r2 = "precacheCanceled"
            r0.put(r1, r2)
            java.lang.String r1 = "src"
            java.lang.String r2 = r4.zza
            r0.put(r1, r2)
            java.lang.String r1 = r4.zzb
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L20
            java.lang.String r2 = "cachedSrc"
            r0.put(r2, r1)
        L20:
            java.lang.String r1 = r4.zzc
            int r2 = r1.hashCode()
            java.lang.String r3 = "internal"
            switch(r2) {
                case -1947652542: goto L7a;
                case -1396664534: goto L6f;
                case -1347010958: goto L6c;
                case -918817863: goto L63;
                case -659376217: goto L60;
                case -642208130: goto L5d;
                case -354048396: goto L52;
                case -32082395: goto L49;
                case 3387234: goto L46;
                case 96784904: goto L40;
                case 580119100: goto L35;
                case 725497484: goto L2c;
                default: goto L2b;
            }
        L2b:
            goto L7d
        L2c:
            java.lang.String r2 = "noCacheDir"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L7d
            goto L3d
        L35:
            java.lang.String r2 = "expireFailed"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L7d
        L3d:
            java.lang.String r3 = "io"
            goto L7d
        L40:
            java.lang.String r2 = "error"
        L42:
            r1.equals(r2)
            goto L7d
        L46:
            java.lang.String r2 = "noop"
            goto L42
        L49:
            java.lang.String r2 = "externalAbort"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L7d
            goto L5a
        L52:
            java.lang.String r2 = "sizeExceeded"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L7d
        L5a:
            java.lang.String r3 = "policy"
            goto L7d
        L5d:
            java.lang.String r2 = "playerFailed"
            goto L42
        L60:
            java.lang.String r2 = "contentLengthMissing"
            goto L42
        L63:
            java.lang.String r2 = "downloadTimeout"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L7d
            goto L77
        L6c:
            java.lang.String r2 = "inProgress"
            goto L42
        L6f:
            java.lang.String r2 = "badUrl"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L7d
        L77:
            java.lang.String r3 = "network"
            goto L7d
        L7a:
            java.lang.String r2 = "interrupted"
            goto L42
        L7d:
            java.lang.String r2 = "type"
            r0.put(r2, r3)
            java.lang.String r2 = "reason"
            r0.put(r2, r1)
            java.lang.String r1 = r4.zzd
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L94
            java.lang.String r2 = "message"
            r0.put(r2, r1)
        L94:
            com.google.android.gms.internal.ads.zzcdl r1 = r4.zze
            java.lang.String r2 = "onPrecacheEvent"
            com.google.android.gms.internal.ads.zzcdl.zze(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdk.run():void");
    }
}
