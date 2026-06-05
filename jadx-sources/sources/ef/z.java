package ef;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.anonlab.voidlauncher.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final int f6070a;

    /* renamed from: b, reason: collision with root package name */
    public final m f6071b;

    /* renamed from: c, reason: collision with root package name */
    public final int[][] f6072c;

    /* renamed from: d, reason: collision with root package name */
    public final m[] f6073d;

    /* renamed from: e, reason: collision with root package name */
    public final y f6074e;

    /* renamed from: f, reason: collision with root package name */
    public final y f6075f;

    /* renamed from: g, reason: collision with root package name */
    public final y f6076g;

    /* renamed from: h, reason: collision with root package name */
    public final y f6077h;

    public z(ak.m mVar) {
        this.f6070a = mVar.f665b;
        this.f6071b = (m) mVar.f666c;
        this.f6072c = (int[][]) mVar.f667d;
        this.f6073d = (m[]) mVar.f668e;
        this.f6074e = (y) mVar.f669f;
        this.f6075f = (y) mVar.f670g;
        this.f6076g = (y) mVar.f671h;
        this.f6077h = (y) mVar.f672i;
    }

    public static void a(ak.m mVar, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = me.a.f11655o;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                m mVarA = m.a(context, typedArrayObtainAttributes.getResourceId(0, 0), typedArrayObtainAttributes.getResourceId(1, 0), new a(0)).a();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i10 = 0;
                for (int i11 = 0; i11 < attributeCount; i11++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i12 = i10 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i10] = attributeNameResource;
                        i10 = i12;
                    }
                }
                mVar.a(StateSet.trimStateSet(iArr2, i10), mVarA);
            }
        }
    }

    public static z b(Context context, TypedArray typedArray, int i10) {
        XmlResourceParser xml;
        AttributeSet attributeSetAsAttributeSet;
        int next;
        int resourceId = typedArray.getResourceId(i10, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        ak.m mVar = new ak.m(1);
        mVar.c();
        try {
            xml = context.getResources().getXml(resourceId);
            try {
                attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
            } catch (Throwable th2) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            mVar.c();
        }
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        if (xml.getName().equals("selector")) {
            a(mVar, context, xml, attributeSetAsAttributeSet, context.getTheme());
        }
        xml.close();
        if (mVar.f665b == 0) {
            return null;
        }
        return new z(mVar);
    }

    public final m c() {
        m mVar = this.f6071b;
        y yVar = this.f6077h;
        y yVar2 = this.f6076g;
        y yVar3 = this.f6075f;
        y yVar4 = this.f6074e;
        if (yVar4 == null && yVar3 == null && yVar2 == null && yVar == null) {
            return mVar;
        }
        l lVarF = mVar.f();
        if (yVar4 != null) {
            lVarF.f6011e = yVar4.f6067b;
        }
        if (yVar3 != null) {
            lVarF.f6012f = yVar3.f6067b;
        }
        if (yVar2 != null) {
            lVarF.f6014h = yVar2.f6067b;
        }
        if (yVar != null) {
            lVarF.f6013g = yVar.f6067b;
        }
        return lVarF.a();
    }

    public final boolean d() {
        y yVar;
        y yVar2;
        y yVar3;
        y yVar4;
        return this.f6070a > 1 || ((yVar = this.f6074e) != null && yVar.f6066a > 1) || (((yVar2 = this.f6075f) != null && yVar2.f6066a > 1) || (((yVar3 = this.f6076g) != null && yVar3.f6066a > 1) || ((yVar4 = this.f6077h) != null && yVar4.f6066a > 1)));
    }
}
