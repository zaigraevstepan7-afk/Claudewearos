package mh;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import cg.m;
import fj.l;
import java.io.Serializable;
import java.util.List;
import qi.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11694a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11695b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f11696c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f11697d;

    /* renamed from: e, reason: collision with root package name */
    public int f11698e;

    /* renamed from: f, reason: collision with root package name */
    public int f11699f;

    public /* synthetic */ d() {
        this.f11694a = 2;
    }

    public static String c(cg.i iVar) {
        iVar.b();
        m mVar = iVar.f3369c;
        String str = mVar.f3385e;
        if (str != null) {
            return str;
        }
        iVar.b();
        String str2 = mVar.f3382b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public static String d(cg.i iVar) {
        iVar.b();
        m mVar = iVar.f3369c;
        String str = mVar.f3385e;
        if (str != null) {
            return str;
        }
        iVar.b();
        String str2 = mVar.f3382b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int[], java.io.Serializable] */
    public int a(long j) {
        int i10 = this.f11698e + 1;
        long[] jArr = (long[]) this.f11695b;
        int length = jArr.length;
        if (i10 > length) {
            int i11 = length * 2;
            long[] jArr2 = new long[i11];
            ?? r2 = new int[i11];
            k.h0(jArr, jArr2, 0, 0, jArr.length);
            k.j0(0, 0, 14, (int[]) this.f11696c, r2);
            this.f11695b = jArr2;
            this.f11696c = r2;
        }
        int i12 = this.f11698e;
        this.f11698e = i12 + 1;
        int length2 = ((int[]) this.f11697d).length;
        if (this.f11699f >= length2) {
            int i13 = length2 * 2;
            ?? r22 = new int[i13];
            int i14 = 0;
            while (i14 < i13) {
                int i15 = i14 + 1;
                r22[i14] = i15;
                i14 = i15;
            }
            k.j0(0, 0, 14, (int[]) this.f11697d, r22);
            this.f11697d = r22;
        }
        int i16 = this.f11699f;
        int[] iArr = (int[]) this.f11697d;
        this.f11699f = iArr[i16];
        long[] jArr3 = (long[]) this.f11695b;
        jArr3[i12] = j;
        ((int[]) this.f11696c)[i12] = i16;
        iArr[i16] = i12;
        while (i12 > 0) {
            int i17 = ((i12 + 1) >> 1) - 1;
            if (l.i(jArr3[i17], j) <= 0) {
                break;
            }
            h(i17, i12);
            i12 = i17;
        }
        return i16;
    }

    public synchronized String b() {
        int i10 = this.f11694a;
        synchronized (this) {
            switch (i10) {
                case 0:
                    try {
                        if (((String) this.f11696c) == null) {
                            g();
                        }
                        return (String) this.f11696c;
                    } finally {
                    }
                default:
                    try {
                        if (((String) this.f11696c) == null) {
                            g();
                        }
                        return (String) this.f11696c;
                    } finally {
                    }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        r3 = java.lang.String.valueOf(r3);
        r1 = new java.lang.StringBuilder(r3.length() + 23);
        r1.append("Failed to find package ");
        r1.append(r3);
        android.util.Log.w("FirebaseInstanceId", r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Failed to find package " + r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.content.pm.PackageInfo e(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r2.f11694a
            switch(r0) {
                case 0: goto L29;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.f11695b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
            android.content.Context r0 = (android.content.Context) r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
            r1 = 0
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
            goto L28
        L13:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to find package "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "FirebaseMessaging"
            android.util.Log.w(r0, r3)
            r3 = 0
        L28:
            return r3
        L29:
            java.lang.Object r0 = r2.f11695b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            android.content.Context r0 = (android.content.Context) r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            r1 = 0
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            goto L59
        L37:
            r3 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r0 = r3.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 23
            r1.<init>(r0)
            java.lang.String r0 = "Failed to find package "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = "FirebaseInstanceId"
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r3, r0)
            r3 = 0
        L59:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.d.e(java.lang.String):android.content.pm.PackageInfo");
    }

    public boolean f() {
        int i10;
        synchronized (this) {
            i10 = this.f11699f;
            if (i10 == 0) {
                PackageManager packageManager = ((Context) this.f11695b).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i10 = 0;
                } else {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        this.f11699f = 2;
                    } else {
                        this.f11699f = 2;
                    }
                    i10 = 2;
                }
            }
        }
        return i10 != 0;
    }

    public synchronized void g() {
        int i10 = this.f11694a;
        synchronized (this) {
            switch (i10) {
                case 0:
                    PackageInfo packageInfoE = e(((Context) this.f11695b).getPackageName());
                    if (packageInfoE != null) {
                        this.f11696c = Integer.toString(packageInfoE.versionCode);
                        this.f11697d = packageInfoE.versionName;
                    }
                    return;
                default:
                    PackageInfo packageInfoE2 = e(((Context) this.f11695b).getPackageName());
                    if (packageInfoE2 != null) {
                        this.f11696c = Integer.toString(packageInfoE2.versionCode);
                        this.f11697d = packageInfoE2.versionName;
                    }
                    return;
            }
        }
    }

    public void h(int i10, int i11) {
        long[] jArr = (long[]) this.f11695b;
        int[] iArr = (int[]) this.f11696c;
        int[] iArr2 = (int[]) this.f11697d;
        long j = jArr[i10];
        jArr[i10] = jArr[i11];
        jArr[i11] = j;
        int i12 = iArr[i10];
        int i13 = iArr[i11];
        iArr[i10] = i13;
        iArr[i11] = i12;
        iArr2[i13] = i10;
        iArr2[i12] = i11;
    }

    public /* synthetic */ d(Context context, int i10) {
        this.f11694a = i10;
        this.f11699f = 0;
        this.f11695b = context;
    }
}
