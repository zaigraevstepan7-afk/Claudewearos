package kk;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final y f9748a = new y(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f9749b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f9750c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f9749b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        f9750c = atomicReferenceArr;
    }

    public static final void a(y yVar) {
        fj.l.f(yVar, "segment");
        if (yVar.f9746f != null || yVar.f9747g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (yVar.f9744d) {
            return;
        }
        AtomicReference atomicReference = f9750c[(int) (Thread.currentThread().getId() & (f9749b - 1))];
        y yVar2 = f9748a;
        y yVar3 = (y) atomicReference.getAndSet(yVar2);
        if (yVar3 == yVar2) {
            return;
        }
        int i10 = yVar3 != null ? yVar3.f9743c : 0;
        if (i10 >= 65536) {
            atomicReference.set(yVar3);
            return;
        }
        yVar.f9746f = yVar3;
        yVar.f9742b = 0;
        yVar.f9743c = i10 + 8192;
        atomicReference.set(yVar);
    }

    public static final y b() {
        AtomicReference atomicReference = f9750c[(int) (Thread.currentThread().getId() & (f9749b - 1))];
        y yVar = f9748a;
        y yVar2 = (y) atomicReference.getAndSet(yVar);
        if (yVar2 == yVar) {
            return new y();
        }
        if (yVar2 == null) {
            atomicReference.set(null);
            return new y();
        }
        atomicReference.set(yVar2.f9746f);
        yVar2.f9746f = null;
        yVar2.f9743c = 0;
        return yVar2;
    }
}
