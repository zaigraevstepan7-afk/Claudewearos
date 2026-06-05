package kk;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class e extends e0 {

    /* renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f9683h;

    /* renamed from: i, reason: collision with root package name */
    public static final Condition f9684i;
    public static final long j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f9685k;

    /* renamed from: l, reason: collision with root package name */
    public static e f9686l;

    /* renamed from: e, reason: collision with root package name */
    public int f9687e;

    /* renamed from: f, reason: collision with root package name */
    public e f9688f;

    /* renamed from: g, reason: collision with root package name */
    public long f9689g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f9683h = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        fj.l.e(conditionNewCondition, "newCondition(...)");
        f9684i = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        j = millis;
        f9685k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        long j4 = this.f9693c;
        boolean z2 = this.f9691a;
        if (j4 != 0 || z2) {
            ReentrantLock reentrantLock = f9683h;
            reentrantLock.lock();
            try {
                if (this.f9687e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f9687e = 1;
                h9.a.f(this, j4, z2);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f9683h;
        reentrantLock.lock();
        try {
            int i10 = this.f9687e;
            this.f9687e = 0;
            if (i10 != 1) {
                return i10 == 2;
            }
            e eVar = f9686l;
            while (eVar != null) {
                e eVar2 = eVar.f9688f;
                if (eVar2 == this) {
                    eVar.f9688f = this.f9688f;
                    this.f9688f = null;
                    return false;
                }
                eVar = eVar2;
            }
            throw new IllegalStateException("node was not found in the queue");
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j() {
    }
}
