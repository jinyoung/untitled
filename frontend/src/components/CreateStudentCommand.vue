<template>

    <v-card outlined>
        <v-card-title>
            CreateStudent
        </v-card-title>

        <v-card-text>
            <String label="StudentId" v-model="value.studentId" :editMode="editMode"/>
            <String label="Name" v-model="value.name" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="createStudent"
            >
                CreateStudent
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
        name: 'CreateStudentCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.studentId = '';
            this.value.name = '';
        },
        watch: {
        },
        methods: {
            createStudent() {
                this.$emit('createStudent', this.value);
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

