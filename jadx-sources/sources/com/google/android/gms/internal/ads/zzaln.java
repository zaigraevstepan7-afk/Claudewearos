package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzaln {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzfyk zze = zzfyk.zzp("auto", "none");
    private static final zzfyk zzf = zzfyk.zzq("dot", "sesame", "circle");
    private static final zzfyk zzg = zzfyk.zzp("filled", "open");
    private static final zzfyk zzh = zzfyk.zzq("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzaln(int i10, int i11, int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzaln zza(java.lang.String r7) {
        /*
            if (r7 != 0) goto L4
            goto Le3
        L4:
            java.lang.String r7 = r7.trim()
            java.lang.String r7 = com.google.android.gms.internal.ads.zzfuk.zza(r7)
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto Le3
            java.util.regex.Pattern r0 = com.google.android.gms.internal.ads.zzaln.zzd
            java.lang.String[] r7 = android.text.TextUtils.split(r7, r0)
            com.google.android.gms.internal.ads.zzfyk r7 = com.google.android.gms.internal.ads.zzfyk.zzm(r7)
            com.google.android.gms.internal.ads.zzfyk r0 = com.google.android.gms.internal.ads.zzaln.zzh
            com.google.android.gms.internal.ads.zzgaf r0 = com.google.android.gms.internal.ads.zzgah.zzb(r0, r7)
            java.lang.String r1 = "outside"
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzfyl.zza(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r2 = r0.hashCode()
            r3 = -1106037339(0xffffffffbe1335a5, float:-0.14375933)
            r4 = 1
            r5 = 2
            if (r2 == r3) goto L45
            r1 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r2 == r1) goto L3b
            goto L4d
        L3b:
            java.lang.String r1 = "after"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4d
            r0 = r5
            goto L4e
        L45:
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4d
            r0 = -2
            goto L4e
        L4d:
            r0 = r4
        L4e:
            com.google.android.gms.internal.ads.zzfyk r1 = com.google.android.gms.internal.ads.zzaln.zze
            com.google.android.gms.internal.ads.zzgaf r1 = com.google.android.gms.internal.ads.zzgah.zzb(r1, r7)
            boolean r2 = r1.isEmpty()
            r3 = -1
            r6 = 0
            if (r2 != 0) goto L7d
            java.util.Iterator r7 = r1.iterator()
            java.lang.Object r7 = r7.next()
            java.lang.String r7 = (java.lang.String) r7
            int r1 = r7.hashCode()
            r2 = 3387192(0x33af38, float:4.746467E-39)
            if (r1 == r2) goto L70
            goto L7b
        L70:
            java.lang.String r1 = "none"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L7b
            r4 = r6
            goto Ldd
        L7b:
            r4 = r3
            goto Ldd
        L7d:
            com.google.android.gms.internal.ads.zzfyk r1 = com.google.android.gms.internal.ads.zzaln.zzg
            com.google.android.gms.internal.ads.zzgaf r1 = com.google.android.gms.internal.ads.zzgah.zzb(r1, r7)
            com.google.android.gms.internal.ads.zzfyk r2 = com.google.android.gms.internal.ads.zzaln.zzf
            com.google.android.gms.internal.ads.zzgaf r7 = com.google.android.gms.internal.ads.zzgah.zzb(r2, r7)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L96
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L96
            goto L7b
        L96:
            java.lang.String r2 = "filled"
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzfyl.zza(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.hashCode()
            r3 = 3417674(0x34264a, float:4.789181E-39)
            if (r2 == r3) goto La8
            goto Lb2
        La8:
            java.lang.String r2 = "open"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lb2
            r6 = r5
            goto Lb3
        Lb2:
            r6 = r4
        Lb3:
            java.lang.String r1 = "circle"
            java.lang.Object r7 = com.google.android.gms.internal.ads.zzfyl.zza(r7, r1)
            java.lang.String r7 = (java.lang.String) r7
            int r1 = r7.hashCode()
            r2 = -905816648(0xffffffffca0255b8, float:-2135406.0)
            if (r1 == r2) goto Ld4
            r2 = 99657(0x18549, float:1.39649E-40)
            if (r1 == r2) goto Lca
            goto Ldd
        Lca:
            java.lang.String r1 = "dot"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto Ldd
            r4 = r5
            goto Ldd
        Ld4:
            java.lang.String r1 = "sesame"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto Ldd
            r4 = 3
        Ldd:
            com.google.android.gms.internal.ads.zzaln r7 = new com.google.android.gms.internal.ads.zzaln
            r7.<init>(r4, r6, r0)
            return r7
        Le3:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaln.zza(java.lang.String):com.google.android.gms.internal.ads.zzaln");
    }
}
