package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.t;
import com.google.android.gms.internal.ads.zzcdl;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.t> extends com.google.android.gms.common.api.r {
    static final ThreadLocal zaa = new ag.a(6);
    public static final /* synthetic */ int zad = 0;

    @KeepName
    private b1 resultGuardian;
    protected final f zab;
    protected final WeakReference zac;
    private com.google.android.gms.common.api.u zah;
    private com.google.android.gms.common.api.t zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private com.google.android.gms.common.internal.o zao;
    private volatile t0 zap;
    private final Object zae = new Object();
    private final CountDownLatch zaf = new CountDownLatch(1);
    private final ArrayList zag = new ArrayList();
    private final AtomicReference zai = new AtomicReference();
    private boolean zaq = false;

    public BasePendingResult(com.google.android.gms.common.api.p pVar) {
        this.zab = new f(pVar != null ? ((j0) pVar).f3557b.getLooper() : Looper.getMainLooper());
        this.zac = new WeakReference(pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void zal(com.google.android.gms.common.api.t tVar) {
        if (tVar instanceof zzcdl) {
            try {
                ((zzcdl) tVar).release();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(tVar)), e10);
            }
        }
    }

    public final com.google.android.gms.common.api.t a() {
        com.google.android.gms.common.api.t tVar;
        synchronized (this.zae) {
            com.google.android.gms.common.internal.e0.k("Result has already been consumed.", !this.zal);
            com.google.android.gms.common.internal.e0.k("Result is not ready.", isReady());
            tVar = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        if (this.zai.getAndSet(null) != null) {
            throw new ClassCastException();
        }
        com.google.android.gms.common.internal.e0.i(tVar);
        return tVar;
    }

    public final void addStatusListener(com.google.android.gms.common.api.q qVar) {
        com.google.android.gms.common.internal.e0.a("Callback cannot be null.", qVar != null);
        synchronized (this.zae) {
            try {
                if (isReady()) {
                    qVar.a(this.zak);
                } else {
                    this.zag.add(qVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @ResultIgnorabilityUnspecified
    public final R await() throws InterruptedException {
        com.google.android.gms.common.internal.e0.h("await must not be called on the UI thread");
        com.google.android.gms.common.internal.e0.k("Result has already been consumed", !this.zal);
        com.google.android.gms.common.internal.e0.k("Cannot await if then() has been called.", this.zap == null);
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f3489f);
        }
        com.google.android.gms.common.internal.e0.k("Result is not ready.", isReady());
        return (R) a();
    }

    public final void b(com.google.android.gms.common.api.t tVar) {
        this.zaj = tVar;
        this.zak = tVar.getStatus();
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            com.google.android.gms.common.api.u uVar = this.zah;
            if (uVar != null) {
                this.zab.removeMessages(2);
                this.zab.a(uVar, a());
            } else if (this.zaj instanceof zzcdl) {
                this.resultGuardian = new b1(this);
            }
        }
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((com.google.android.gms.common.api.q) arrayList.get(i10)).a(this.zak);
        }
        this.zag.clear();
    }

    public void cancel() {
        synchronized (this.zae) {
            try {
                if (!this.zam && !this.zal) {
                    zal(this.zaj);
                    this.zam = true;
                    b(createFailedResult(Status.B));
                }
            } finally {
            }
        }
    }

    public abstract com.google.android.gms.common.api.t createFailedResult(Status status);

    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            try {
                if (!isReady()) {
                    setResult((BasePendingResult<R>) createFailedResult(status));
                    this.zan = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean isCanceled() {
        boolean z2;
        synchronized (this.zae) {
            z2 = this.zam;
        }
        return z2;
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    public final void setCancelToken(com.google.android.gms.common.internal.o oVar) {
        synchronized (this.zae) {
        }
    }

    public final void setResultCallback(com.google.android.gms.common.api.u uVar) {
        synchronized (this.zae) {
            try {
                if (uVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z2 = true;
                com.google.android.gms.common.internal.e0.k("Result has already been consumed.", !this.zal);
                if (this.zap != null) {
                    z2 = false;
                }
                com.google.android.gms.common.internal.e0.k("Cannot set callbacks if then() has been called.", z2);
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(uVar, a());
                } else {
                    this.zah = uVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final <S extends com.google.android.gms.common.api.t> com.google.android.gms.common.api.w then(com.google.android.gms.common.api.v vVar) {
        t0 t0Var;
        com.google.android.gms.common.internal.e0.k("Result has already been consumed.", !this.zal);
        synchronized (this.zae) {
            try {
                com.google.android.gms.common.internal.e0.k("Cannot call then() twice.", this.zap == null);
                com.google.android.gms.common.internal.e0.k("Cannot call then() if callbacks are set.", this.zah == null);
                com.google.android.gms.common.internal.e0.k("Cannot call then() if result was canceled.", !this.zam);
                this.zaq = true;
                this.zap = new t0(this.zac);
                t0 t0Var2 = this.zap;
                synchronized (t0Var2.f3588b) {
                    t0Var = new t0(t0Var2.f3589c);
                    t0Var2.f3587a = t0Var;
                }
                if (isReady()) {
                    this.zab.a(this.zap, a());
                } else {
                    this.zah = this.zap;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t0Var;
    }

    public final void zak() {
        boolean z2 = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z2 = false;
        }
        this.zaq = z2;
    }

    public final boolean zam() {
        boolean zIsCanceled;
        synchronized (this.zae) {
            try {
                if (((com.google.android.gms.common.api.p) this.zac.get()) == null || !this.zaq) {
                    cancel();
                }
                zIsCanceled = isCanceled();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zIsCanceled;
    }

    public final void zan(u0 u0Var) {
        this.zai.set(u0Var);
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void setResult(R r2) {
        synchronized (this.zae) {
            try {
                if (this.zan || this.zam) {
                    zal(r2);
                    return;
                }
                isReady();
                com.google.android.gms.common.internal.e0.k("Results have already been set", !isReady());
                com.google.android.gms.common.internal.e0.k("Result has already been consumed", !this.zal);
                b(r2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.api.r
    @ResultIgnorabilityUnspecified
    public final R await(long j, TimeUnit timeUnit) {
        if (j > 0) {
            com.google.android.gms.common.internal.e0.h("await must not be called on the UI thread when time is greater than zero.");
        }
        com.google.android.gms.common.internal.e0.k("Result has already been consumed.", !this.zal);
        com.google.android.gms.common.internal.e0.k("Cannot await if then() has been called.", this.zap == null);
        try {
            if (!this.zaf.await(j, timeUnit)) {
                forceFailureUnlessReady(Status.A);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f3489f);
        }
        com.google.android.gms.common.internal.e0.k("Result is not ready.", isReady());
        return (R) a();
    }

    public final void setResultCallback(com.google.android.gms.common.api.u uVar, long j, TimeUnit timeUnit) {
        synchronized (this.zae) {
            try {
                if (uVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z2 = true;
                com.google.android.gms.common.internal.e0.k("Result has already been consumed.", !this.zal);
                if (this.zap != null) {
                    z2 = false;
                }
                com.google.android.gms.common.internal.e0.k("Cannot set callbacks if then() has been called.", z2);
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(uVar, a());
                } else {
                    this.zah = uVar;
                    f fVar = this.zab;
                    fVar.sendMessageDelayed(fVar.obtainMessage(2, this), timeUnit.toMillis(j));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
