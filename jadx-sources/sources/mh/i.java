package mh;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11714a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11715b;

    /* renamed from: c, reason: collision with root package name */
    public final PowerManager.WakeLock f11716c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadPoolExecutor f11717d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11718e;

    public i(FirebaseInstanceId firebaseInstanceId, long j) {
        this.f11714a = 0;
        this.f11717d = hj.a.B();
        this.f11718e = firebaseInstanceId;
        this.f11715b = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f11716c = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public Context a() {
        cg.i iVar = ((FirebaseInstanceId) this.f11718e).f4280b;
        iVar.b();
        return iVar.f3367a;
    }

    public boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.f11718e).f4295c.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean c() throws IOException {
        switch (this.f11714a) {
            case 0:
                FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) this.f11718e;
                if (!firebaseInstanceId.j(firebaseInstanceId.g(d.c(firebaseInstanceId.f4280b), "*"))) {
                    return true;
                }
                try {
                } catch (IOException e10) {
                    String message = e10.getMessage();
                    if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                        String message2 = e10.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 52);
                        sb2.append("Token retrieval failed: ");
                        sb2.append(message2);
                        sb2.append(". Will retry token retrieval");
                        Log.w("FirebaseInstanceId", sb2.toString());
                    } else {
                        if (e10.getMessage() != null) {
                            throw e10;
                        }
                        Log.w("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
                    }
                } catch (SecurityException unused) {
                    Log.w("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
                }
                if (firebaseInstanceId.b() == null) {
                    Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                    return false;
                }
                if (!Log.isLoggable("FirebaseInstanceId", 3)) {
                    return true;
                }
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
                return true;
            default:
                try {
                    if (((FirebaseMessaging) this.f11718e).a() == null) {
                        Log.e("FirebaseMessaging", "Token retrieval failed: null");
                        return false;
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Token successfully retrieved");
                    }
                    return true;
                } catch (IOException e11) {
                    String message3 = e11.getMessage();
                    if (!"SERVICE_NOT_AVAILABLE".equals(message3) && !"INTERNAL_SERVER_ERROR".equals(message3) && !"InternalServerError".equals(message3)) {
                        if (e11.getMessage() != null) {
                            throw e11;
                        }
                        Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                        return false;
                    }
                    Log.w("FirebaseMessaging", "Token retrieval failed: " + e11.getMessage() + ". Will retry token retrieval");
                    return false;
                } catch (SecurityException unused2) {
                    Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
                    return false;
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x015c A[Catch: all -> 0x0158, IOException -> 0x015a, TRY_ENTER, TryCatch #2 {IOException -> 0x015a, blocks: (B:70:0x00eb, B:73:0x00ef, B:74:0x00f0, B:76:0x00f6, B:78:0x00f9, B:84:0x010f, B:85:0x0110, B:87:0x011e, B:89:0x012c, B:92:0x0134, B:97:0x013e, B:105:0x015c, B:107:0x0162, B:109:0x0165, B:113:0x0169, B:114:0x016a, B:120:0x0180), top: B:141:0x00eb, outer: #4 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.i.run():void");
    }

    public i(FirebaseMessaging firebaseMessaging, long j) {
        this.f11714a = 1;
        this.f11717d = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new rc.b("firebase-iid-executor", 1));
        this.f11718e = firebaseMessaging;
        this.f11715b = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f4295c.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f11716c = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }
}
