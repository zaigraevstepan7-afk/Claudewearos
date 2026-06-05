package f0;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements b1, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long A;

    /* renamed from: a, reason: collision with root package name */
    public final View f6108a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6110c;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6113f;

    /* renamed from: z, reason: collision with root package name */
    public long f6114z;

    /* renamed from: b, reason: collision with root package name */
    public final PriorityQueue f6109b = new PriorityQueue(11, new bk.b(1));

    /* renamed from: d, reason: collision with root package name */
    public final Choreographer f6111d = Choreographer.getInstance();

    /* renamed from: e, reason: collision with root package name */
    public final a f6112e = new a();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.view.View r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.f6108a = r5
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            bk.b r1 = new bk.b
            r2 = 1
            r1.<init>(r2)
            r2 = 11
            r0.<init>(r2, r1)
            r4.f6109b = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r4.f6111d = r0
            f0.a r0 = new f0.a
            r0.<init>()
            r4.f6112e = r0
            long r0 = f0.b.A
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L4a
            android.view.Display r0 = r5.getDisplay()
            boolean r1 = r5.isInEditMode()
            if (r1 != 0) goto L40
            if (r0 == 0) goto L40
            float r0 = r0.getRefreshRate()
            r1 = 1106247680(0x41f00000, float:30.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L40
            goto L42
        L40:
            r0 = 1114636288(0x42700000, float:60.0)
        L42:
            r1 = 1000000000(0x3b9aca00, float:0.0047237873)
            float r1 = (float) r1
            float r1 = r1 / r0
            long r0 = (long) r1
            f0.b.A = r0
        L4a:
            r5.addOnAttachStateChangeListener(r4)
            boolean r5 = r5.isAttachedToWindow()
            if (r5 == 0) goto L56
            r5 = 1
            r4.f6113f = r5
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.b.<init>(android.view.View):void");
    }

    @Override // f0.b1
    public void a(z0 z0Var) {
        this.f6109b.add(new e1(1, z0Var));
        if (this.f6110c) {
            return;
        }
        this.f6110c = true;
        this.f6108a.post(this);
    }

    public final boolean b() {
        a aVar = this.f6112e;
        long jA = aVar.a();
        u3.a.o(jA, "compose:lazy:prefetch:available_time_nanos");
        boolean z2 = true;
        if (jA > 0) {
            PriorityQueue priorityQueue = this.f6109b;
            Object objPeek = priorityQueue.peek();
            fj.l.c(objPeek);
            if (!((e1) objPeek).f6136b.c(aVar)) {
                priorityQueue.poll();
                z2 = false;
            }
            aVar.f6099a = false;
        }
        return z2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f6113f) {
            this.f6114z = j;
            this.f6108a.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f6113f = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f6113f = false;
        this.f6108a.removeCallbacks(this);
        this.f6111d.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.f6109b;
        if (!priorityQueue.isEmpty() && this.f6110c && this.f6113f) {
            View view = this.f6108a;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z2 = System.nanoTime() > (((long) 2) * A) + nanos;
                a aVar = this.f6112e;
                aVar.f6099a = z2;
                aVar.f6100b = Math.max(this.f6114z, nanos) + A;
                boolean zB = false;
                while (!priorityQueue.isEmpty() && !zB) {
                    if (aVar.f6099a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zB = b();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        zB = b();
                    }
                }
                if (zB) {
                    this.f6111d.postFrameCallback(this);
                } else {
                    this.f6110c = false;
                }
                u3.a.o(0L, "compose:lazy:prefetch:available_time_nanos");
                return;
            }
        }
        this.f6110c = false;
    }
}
