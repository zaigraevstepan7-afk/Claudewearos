package f2;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import c1.y2;
import c2.u;
import c2.v;
import s3.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends View {
    public static final y2 D = new y2(1);
    public m A;
    public ej.c B;
    public b C;

    /* renamed from: a, reason: collision with root package name */
    public final g2.a f6611a;

    /* renamed from: b, reason: collision with root package name */
    public final v f6612b;

    /* renamed from: c, reason: collision with root package name */
    public final e2.b f6613c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6614d;

    /* renamed from: e, reason: collision with root package name */
    public Outline f6615e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6616f;

    /* renamed from: z, reason: collision with root package name */
    public s3.c f6617z;

    public l(g2.a aVar, v vVar, e2.b bVar) {
        super(aVar.getContext());
        this.f6611a = aVar;
        this.f6612b = vVar;
        this.f6613c = bVar;
        setOutlineProvider(D);
        this.f6616f = true;
        this.f6617z = e2.c.f5741a;
        this.A = m.f14752a;
        d.f6538a.getClass();
        this.B = a.f6512c;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        v vVar = this.f6612b;
        c2.b bVar = vVar.f3047a;
        Canvas canvas2 = bVar.f2965a;
        bVar.f2965a = canvas;
        s3.c cVar = this.f6617z;
        m mVar = this.A;
        float width = getWidth();
        float height = getHeight();
        long jFloatToRawIntBits = (Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        b bVar2 = this.C;
        ej.c cVar2 = this.B;
        e2.b bVar3 = this.f6613c;
        s3.c cVarK = bVar3.C0().k();
        m mVarS = bVar3.C0().s();
        u uVarH = bVar3.C0().h();
        long jY = bVar3.C0().y();
        b bVar4 = (b) bVar3.C0().f374c;
        ac.d dVarC0 = bVar3.C0();
        dVarC0.O(cVar);
        dVarC0.P(mVar);
        dVarC0.N(bVar);
        dVarC0.Q(jFloatToRawIntBits);
        dVarC0.f374c = bVar2;
        bVar.f();
        try {
            cVar2.invoke(bVar3);
            bVar.q();
            ac.d dVarC02 = bVar3.C0();
            dVarC02.O(cVarK);
            dVarC02.P(mVarS);
            dVarC02.N(uVarH);
            dVarC02.Q(jY);
            dVarC02.f374c = bVar4;
            vVar.f3047a.f2965a = canvas2;
            this.f6614d = false;
        } catch (Throwable th2) {
            bVar.q();
            ac.d dVarC03 = bVar3.C0();
            dVarC03.O(cVarK);
            dVarC03.P(mVarS);
            dVarC03.N(uVarH);
            dVarC03.Q(jY);
            dVarC03.f374c = bVar4;
            throw th2;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.f6616f;
    }

    public final v getCanvasHolder() {
        return this.f6612b;
    }

    public final View getOwnerView() {
        return this.f6611a;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f6616f;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f6614d) {
            return;
        }
        this.f6614d = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z2) {
        if (this.f6616f != z2) {
            this.f6616f = z2;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z2) {
        this.f6614d = z2;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i10, int i11, int i12, int i13) {
    }
}
