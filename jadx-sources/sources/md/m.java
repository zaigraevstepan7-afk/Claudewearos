package md;

import ag.n;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.internal.ads.zzcfe;
import com.google.android.gms.internal.ads.zzfrn;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.internal.play_billing.zzej;
import com.google.android.gms.tasks.Task;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import javax.crypto.Mac;
import qc.l0;
import w8.q;
import w8.u;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m implements yf.a, zzej {

    /* renamed from: e, reason: collision with root package name */
    public static m f11637e;

    /* renamed from: a, reason: collision with root package name */
    public int f11638a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11639b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11640c;

    /* renamed from: d, reason: collision with root package name */
    public Object f11641d;

    public m(zzcfe zzcfeVar) throws pc.f {
        this.f11640c = zzcfeVar.getLayoutParams();
        ViewParent parent = zzcfeVar.getParent();
        this.f11639b = zzcfeVar.zzE();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new pc.f("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f11641d = viewGroup;
        this.f11638a = viewGroup.indexOfChild(zzcfeVar.zzF());
        viewGroup.removeView(zzcfeVar.zzF());
        zzcfeVar.zzaq(true);
    }

    public static synchronized m c(Context context) {
        try {
            if (f11637e == null) {
                zze.zza();
                ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new rc.b("MessengerIpcClient", 1)));
                m mVar = new m();
                mVar.f11641d = new k(mVar);
                mVar.f11638a = 1;
                mVar.f11640c = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                mVar.f11639b = context.getApplicationContext();
                f11637e = mVar;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f11637e;
    }

    @Override // yf.a
    public byte[] a(int i10, byte[] bArr) throws IllegalStateException, InvalidAlgorithmParameterException {
        n nVar = (n) this.f11639b;
        if (i10 > this.f11638a) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) nVar.get()).update(bArr);
        return Arrays.copyOf(((Mac) nVar.get()).doFinal(), i10);
    }

    public Looper b() {
        Looper looper;
        Object obj = this.f11641d;
        synchronized (obj) {
            try {
                if (this.f11638a != 0) {
                    e0.j((HandlerThread) this.f11639b, "Invalid state: handlerThread should already been initialized.");
                } else if (((HandlerThread) this.f11639b) == null) {
                    l0.k("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.f11639b = handlerThread;
                    handlerThread.start();
                    this.f11640c = new zzfrn(((HandlerThread) this.f11639b).getLooper());
                    l0.k("Looper thread started.");
                } else {
                    l0.k("Resuming the looper thread");
                    obj.notifyAll();
                }
                this.f11638a++;
                looper = ((HandlerThread) this.f11639b).getLooper();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public synchronized Task d(l lVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(lVar.toString()));
            }
            if (!((k) this.f11641d).d(lVar)) {
                k kVar = new k(this);
                this.f11641d = kVar;
                kVar.d(lVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return lVar.f11633b.getTask();
    }

    @Override // com.google.android.gms.internal.play_billing.zzej
    public void zza(Throwable th2) {
        q qVar = (q) this.f11641d;
        if (th2 instanceof TimeoutException) {
            qVar.z(114, 28, u.f18994r);
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            qVar.z(107, 28, u.f18994r);
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        ((Runnable) this.f11640c).run();
    }

    @Override // com.google.android.gms.internal.play_billing.zzej
    public void zzb(Object obj) {
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        q qVar = (q) this.f11641d;
        if (iIntValue <= 0) {
            ((Runnable) this.f11640c).run();
            return;
        }
        int i10 = this.f11638a;
        w8.c cVarA = u.a(num.intValue(), "Billing override value was set by a license tester.");
        qVar.z(105, i10, cVarA);
        ((Consumer) this.f11639b).accept(cVarA);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(java.lang.String r4, javax.crypto.spec.SecretKeySpec r5) throws java.security.GeneralSecurityException {
        /*
            r3 = this;
            r3.<init>()
            ag.n r0 = new ag.n
            r0.<init>(r3)
            r3.f11639b = r0
            r1 = 2
            boolean r2 = gk.b.b(r1)
            if (r2 == 0) goto L8f
            r3.f11640c = r4
            r3.f11641d = r5
            byte[] r5 = r5.getEncoded()
            int r5 = r5.length
            r2 = 16
            if (r5 < r2) goto L87
            int r5 = r4.hashCode()
            r2 = -1
            switch(r5) {
                case -1823053428: goto L52;
                case 392315023: goto L47;
                case 392315118: goto L3e;
                case 392316170: goto L33;
                case 392317873: goto L28;
                default: goto L26;
            }
        L26:
            r1 = r2
            goto L5c
        L28:
            java.lang.String r5 = "HMACSHA512"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L31
            goto L26
        L31:
            r1 = 4
            goto L5c
        L33:
            java.lang.String r5 = "HMACSHA384"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L3c
            goto L26
        L3c:
            r1 = 3
            goto L5c
        L3e:
            java.lang.String r5 = "HMACSHA256"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L5c
            goto L26
        L47:
            java.lang.String r5 = "HMACSHA224"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L50
            goto L26
        L50:
            r1 = 1
            goto L5c
        L52:
            java.lang.String r5 = "HMACSHA1"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L5b
            goto L26
        L5b:
            r1 = 0
        L5c:
            switch(r1) {
                case 0: goto L7f;
                case 1: goto L7a;
                case 2: goto L75;
                case 3: goto L70;
                case 4: goto L6b;
                default: goto L5f;
            }
        L5f:
            java.security.NoSuchAlgorithmException r5 = new java.security.NoSuchAlgorithmException
            java.lang.String r0 = "unknown Hmac algorithm: "
            java.lang.String r4 = r0.concat(r4)
            r5.<init>(r4)
            throw r5
        L6b:
            r4 = 64
            r3.f11638a = r4
            goto L83
        L70:
            r4 = 48
            r3.f11638a = r4
            goto L83
        L75:
            r4 = 32
            r3.f11638a = r4
            goto L83
        L7a:
            r4 = 28
            r3.f11638a = r4
            goto L83
        L7f:
            r4 = 20
            r3.f11638a = r4
        L83:
            r0.get()
            return
        L87:
            java.security.InvalidAlgorithmParameterException r4 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r5 = "key size too small, need at least 16 bytes"
            r4.<init>(r5)
            throw r4
        L8f:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r5 = "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: md.m.<init>(java.lang.String, javax.crypto.spec.SecretKeySpec):void");
    }
}
