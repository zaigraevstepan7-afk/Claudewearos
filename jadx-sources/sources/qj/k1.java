package qj;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class k1 implements b1 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13590b = AtomicIntegerFieldUpdater.newUpdater(k1.class, "_isCompleting$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13591c = AtomicReferenceFieldUpdater.newUpdater(k1.class, Object.class, "_rootCause$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13592d = AtomicReferenceFieldUpdater.newUpdater(k1.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final n1 f13593a;

    public k1(n1 n1Var, Throwable th2) {
        this.f13593a = n1Var;
        this._rootCause$volatile = th2;
    }

    public final void a(Throwable th2) {
        Throwable thD = d();
        if (thD == null) {
            f13591c.set(this, th2);
            return;
        }
        if (th2 == thD) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13592d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th2);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th2);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th2 == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th2);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    @Override // qj.b1
    public final boolean b() {
        return d() == null;
    }

    @Override // qj.b1
    public final n1 c() {
        return this.f13593a;
    }

    public final Throwable d() {
        return (Throwable) f13591c.get(this);
    }

    public final boolean e() {
        return d() != null;
    }

    public final ArrayList f(Throwable th2) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13592d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable thD = d();
        if (thD != null) {
            arrayList.add(0, thD);
        }
        if (th2 != null && !th2.equals(thD)) {
            arrayList.add(th2);
        }
        atomicReferenceFieldUpdater.set(this, b0.f13555h);
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Finishing[cancelling=");
        sb2.append(e());
        sb2.append(", completing=");
        sb2.append(f13590b.get(this) == 1);
        sb2.append(", rootCause=");
        sb2.append(d());
        sb2.append(", exceptions=");
        sb2.append(f13592d.get(this));
        sb2.append(", list=");
        sb2.append(this.f13593a);
        sb2.append(']');
        return sb2.toString();
    }
}
