package o3;

import android.text.Layout;
import android.text.TextPaint;
import f1.q2;
import g3.n0;
import g3.s;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements s {
    public final CharSequence A;
    public final h3.f B;
    public ac.d C;
    public final boolean D;
    public final int E;

    /* renamed from: a, reason: collision with root package name */
    public final String f12395a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f12396b;

    /* renamed from: c, reason: collision with root package name */
    public final List f12397c;

    /* renamed from: d, reason: collision with root package name */
    public final List f12398d;

    /* renamed from: e, reason: collision with root package name */
    public final k3.i f12399e;

    /* renamed from: f, reason: collision with root package name */
    public final s3.c f12400f;

    /* renamed from: z, reason: collision with root package name */
    public final e f12401z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x07fd  */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v8, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(java.lang.String r42, g3.n0 r43, java.util.List r44, java.util.List r45, k3.i r46, s3.c r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.c.<init>(java.lang.String, g3.n0, java.util.List, java.util.List, k3.i, s3.c):void");
    }

    @Override // g3.s
    public final boolean a() {
        ac.d dVar = this.C;
        if (dVar != null ? dVar.D() : false) {
            return true;
        }
        if (!this.D && j.a(this.f12396b)) {
            ld.i iVar = i.f12417a;
            ld.i iVar2 = i.f12417a;
            q2 q2VarD = (q2) iVar2.f10924b;
            if (q2VarD == null) {
                if (r5.k.d()) {
                    q2VarD = iVar2.D();
                    iVar2.f10924b = q2VarD;
                } else {
                    q2VarD = j.f12418a;
                }
            }
            if (((Boolean) q2VarD.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // g3.s
    public final float b() {
        float f10;
        h3.f fVar = this.B;
        float f11 = fVar.f7594e;
        TextPaint textPaint = fVar.f7591b;
        if (!Float.isNaN(f11)) {
            return fVar.f7594e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = fVar.f7590a;
        lineInstance.setText(new h3.c(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, h3.g.f7598a);
        int i10 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new kj.h(i10, next, 1));
            } else {
                kj.h hVar = (kj.h) priorityQueue.peek();
                if (hVar != null && hVar.f9666b - hVar.f9665a < next - i10) {
                    priorityQueue.poll();
                    priorityQueue.add(new kj.h(i10, next, 1));
                }
            }
            i10 = next;
        }
        if (priorityQueue.isEmpty()) {
            f10 = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            kj.h hVar2 = (kj.h) it.next();
            float desiredWidth = Layout.getDesiredWidth(fVar.b(), hVar2.f9665a, hVar2.f9666b, textPaint);
            while (it.hasNext()) {
                kj.h hVar3 = (kj.h) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(fVar.b(), hVar3.f9665a, hVar3.f9666b, textPaint));
            }
            f10 = desiredWidth;
        }
        fVar.f7594e = f10;
        return f10;
    }

    @Override // g3.s
    public final float c() {
        return this.B.c();
    }
}
