<template>

    <v-card outlined>
        <v-card-title>
            DeleteStudent
        </v-card-title>

        <v-card-text>
            <String label="StudentId" v-model="value.studentId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="deleteStudent"
            >
                DeleteStudent
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'DeleteStudentCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.studentId = '';
        },
        watch: {
        },
        methods: {
            deleteStudent() {
                this.$emit('deleteStudent', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

