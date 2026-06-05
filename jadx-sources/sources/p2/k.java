package p2;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public long f12707a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseLongArray f12708b = new SparseLongArray();

    /* renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f12709c = new SparseBooleanArray();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f12710d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final q.p f12711e = new q.p((Object) null);

    /* renamed from: f, reason: collision with root package name */
    public int f12712f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f12713g = -1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12714h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f12715i;
    public b2.b j;

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f12708b;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j = this.f12707a;
                this.f12707a = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j4 = this.f12707a;
            this.f12707a = 1 + j4;
            sparseLongArray.put(pointerId2, j4);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f12709c.put(pointerId2, true);
            }
        }
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f12712f && source == this.f12713g) {
            return;
        }
        this.f12712f = toolType;
        this.f12713g = source;
        this.f12709c.clear();
        this.f12708b.clear();
    }

    public final mh.g c(MotionEvent motionEvent, w2.t tVar) {
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.f12709c;
        if (actionMasked == 3 || actionMasked == 4) {
            this.f12708b.clear();
            sparseBooleanArray.clear();
            this.f12714h = false;
            this.f12715i = false;
            this.j = null;
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z2 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z10 = actionMasked == 8;
        if (z2) {
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        ArrayList arrayList = this.f12710d;
        arrayList.clear();
        if (motionEvent.getActionMasked() == 0) {
            boolean z11 = Build.VERSION.SDK_INT >= 34 && (motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5);
            boolean z12 = motionEvent.getButtonState() == 0 && (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584));
            if (z11 || z12) {
                this.f12714h = true;
            }
        }
        if (Build.VERSION.SDK_INT < 34 || motionEvent.getClassification() != 3) {
            this.f12715i = false;
            int pointerCount = motionEvent.getPointerCount();
            int i10 = 0;
            while (i10 < pointerCount) {
                arrayList.add(d(tVar, motionEvent, null, i10, (z2 || i10 == actionIndex || (z10 && motionEvent.getButtonState() == 0)) ? false : true));
                i10++;
            }
        } else {
            this.f12715i = true;
            if (motionEvent.getActionMasked() == 0) {
                float rawX = motionEvent.getRawX(0);
                this.j = new b2.b((Float.floatToRawIntBits(motionEvent.getRawY(0)) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32));
            }
            arrayList.add(d(tVar, motionEvent, this.j, 0, false));
        }
        if (motionEvent.getActionMasked() == 1) {
            this.f12714h = false;
            this.f12715i = false;
            this.j = null;
        }
        e(motionEvent);
        motionEvent.getEventTime();
        return new mh.g(27, arrayList, motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0182 A[EDGE_INSN: B:84:0x0182->B:62:0x0182 BREAK  A[LOOP:0: B:43:0x00ea->B:61:0x0179], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p2.y d(w2.t r43, android.view.MotionEvent r44, b2.b r45, int r46, boolean r47) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.k.d(w2.t, android.view.MotionEvent, b2.b, int, boolean):p2.y");
    }

    public final void e(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.f12709c;
        SparseLongArray sparseLongArray = this.f12708b;
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!sparseBooleanArray.get(pointerId, false)) {
                sparseLongArray.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int iKeyAt = sparseLongArray.keyAt(size);
                int pointerCount = motionEvent.getPointerCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= pointerCount) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(iKeyAt);
                        break;
                    } else if (motionEvent.getPointerId(i10) == iKeyAt) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
    }
}
